//https://www.hackerrank.com/contests/101hack46/challenges/marcs-cakewalk

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static long exp(int base,int exponent)
    {
        if(exponent == 0)
        {
            return 1;
        }
        else
        {
            return base * exp(base,exponent - 1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calories = new int[n];
        for(int calories_i=0; calories_i < n; calories_i++){
            calories[calories_i] = in.nextInt();
        }
        
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = i + 1 ; j < n ; j++)
            {
                if(calories[i] < calories[j])
                {
                    int temp;
                    temp = calories[j];
                    calories[j] = calories[i];
                    calories[i] = temp;
                }
            }
        }
        
        long sum = 0L;
        
        for(int i = 0 ; i < n ; i++)
        {
            sum = sum + (long)((exp(2,i) * calories[i]));   
        }
        
        System.out.println(sum);
    }
}
