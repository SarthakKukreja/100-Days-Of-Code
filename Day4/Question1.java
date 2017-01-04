// https://www.hackerrank.com/contests/hourrank-3/challenges/contest-performance/copy-from/8340625

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[5][2];
        for(int i = 0 ; i < 5 ; i++)
        {
            for(int j = 0 ; j < 2 ; j++)
            {
                arr[i][j] = in.nextInt();
            }
        }
        
        int index = 0;
        
        for(int i = 0 ; i < 5 ; i++)
        {
            for(int j = 0 ; j < 4 ; j++)
            {
                if(arr[j][0] > arr[j + 1][0])
                {
                    int temp = arr[j][0];
                    arr[j][0] = arr[j + 1][0];
                    arr[j + 1][0] = temp;
                    
                    temp = arr[j][1];
                    arr[j][1] = arr[j + 1][1];
                    arr[j + 1][1] = temp;
                    
                }
            }
        }
        
        boolean check = true;
        
        for(int i = 0 ; i < 4 ; i ++)
        {
            if(arr[i][1] >= arr[i + 1][1])
            {
                check = false;
            }
        }
        
        if(check)
        {
            System.out.println(1);
        }
        else
        {
            System.out.println(0);
        }
        
        
    }
}
