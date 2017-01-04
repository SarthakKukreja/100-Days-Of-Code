//https://www.hackerrank.com/contests/101hack39/challenges/equality-in-a-array

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner Sc = new Scanner(System.in);
        
        int n = Sc.nextInt();
        int[] arr = new int[101];
        
        for(int i = 0 ; i < n ; i++)
        {
            int a = Sc.nextInt();
            arr[a]++;  
        }
        
        int max = 0;
        
        for(int i = 1 ; i < 101 ; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
        
        System.out.println(n - max);
        
    }
}
