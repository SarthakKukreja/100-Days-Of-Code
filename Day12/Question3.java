//https://www.hackerrank.com/contests/world-codesprint-6/challenges/combination-lock

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int difference(int a,int b)
    {
        int steps = 0;
        while(a != b)
        {
            a = (a + 1) % 10;
            steps++;
        }
        
        return steps;
    }
    
    public static void main(String[] args) {
       
        Scanner Sc = new Scanner(System.in);
        int[] orignal_config = new int[5];
        int[] new_config = new int[5];
        
        for(int i = 0 ; i < 5 ; i++)
        {
            orignal_config[i] = Sc.nextInt();
        }
        
        for(int i = 0 ; i < 5 ; i++)
        {
            new_config[i] = Sc.nextInt();
        }
        
        int steps_total = 0;
        
        for(int i = 0 ; i < 5 ; i++)
        {
            int a = difference(orignal_config[i],new_config[i]);
            int b = difference(new_config[i],orignal_config[i]);
            
            if(a < b)
            {
                steps_total += a;
            }
            else
            {
                steps_total += b;
            }
        }
        
        System.out.println(steps_total);
        
    }
}