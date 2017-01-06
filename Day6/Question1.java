//https://www.hackerrank.com/contests/w21/challenges/luck-balance

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int k = Sc.nextInt();
        
        int luck = 0;
        
        int contests[][] = new int[n][2];
        {
            for(int i = 0 ; i < n ; i++)
            {
                for(int j = 0 ; j < 2 ; j++)
                {
                    contests[i][j] = Sc.nextInt();
                }
            }
        }
        
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n - 1 ; j++)
            {
                if(contests[j][0] < contests[j + 1][0])
                {
                    int temp = contests[j][0];
                    contests[j][0] = contests[j + 1][0];
                    contests[j + 1][0] = temp;
                    
                    temp = contests[j][1];
                    contests[j][1] = contests[j + 1][1];
                    contests[j + 1][1] = temp;
                }
            }
        }
        
        int count = 1;
        
        for(int i = 0 ; i < n ; i++)
        {
            if(contests[i][1] == 0)
            {
                luck += contests[i][0];
            }
            else
            {
                    
                if( count <= k )
                {
                    luck += contests[i][0];
                }
                else
                {
                    luck -= contests[i][0];
                }
                
                count++;
                
            }
        }
        
       System.out.println(luck);
        
    }
}