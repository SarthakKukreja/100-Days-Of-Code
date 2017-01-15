//https://www.hackerrank.com/contests/monthly/challenges/icecream-parlor

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Question4 {

    public static void main(String[] args) {
       
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        
        for(int k = 0 ; k < t ; k++)
        {
            int m = Sc.nextInt();
            int n = Sc.nextInt();
            
            int[] arr = new int[n];
            
            for(int j = 0 ; j < n ; j ++)
            {
                arr[j] = Sc.nextInt();
            }
            
            outerloop:
            for(int i = 0 ; i < n - 1 ; i++)
            {
                for(int j = i + 1 ; j < n ; j++)
                {
                    if(arr[i] + arr[j] == m)
                    {
                        if(i > j)
                        {
                            System.out.println((j + 1)+ " " + (i + 1));
                        }
                        else
                        {
                            System.out.println((i + 1) + " " + (j + 1));
                        }
                        
                        break outerloop;
                    }
                }
            }
        }
    }
}