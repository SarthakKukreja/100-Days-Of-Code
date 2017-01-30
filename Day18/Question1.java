//https://www.hackerrank.com/contests/101hack28/challenges/bags-of-apples
//Three test cases wrong.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int arr[] = new int[n];
        int total = 0;
        
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = Sc.nextInt();
            total += arr[i];
        }
        
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n - 1 ; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        int index = 0;
        
        while(total % 3 != 0)
        {
            total = total - arr[index++]; 
        }
        
        System.out.println(total);
    }
}

