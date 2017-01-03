// https://www.hackerrank.com/contests/hourrank-3/challenges/contest-performance/copy-from/8340625

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Question1 {
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[6];        
        int arr2[] = new int[6];
        for(int i = 1 ; i < 6 ; i++)
        {
            arr[i] = in.nextInt();
            arr2[i] = i;
        }
        
        int total = 0;
        
        for(int i = 1 ; i < 6 ; i++)
        {
            if(arr[i] - arr2[i] <= 10)
            {
                total = total + 100 - (arr[i] - arr2[i]) * 10;
            }
        }
        
        System.out.println(total);
    }
}
