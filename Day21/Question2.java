//https://www.hackerrank.com/challenges/runningtime

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
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = Sc.nextInt();
        }
        
        int count = 0;
        
        for(int i = 0 ; i < n ; i++)
        {
            int key = arr[i];
            int j = i - 1;
            
            while(j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j--;
                count++;
            }
            
            arr[j + 1] = key;
        }
        
        System.out.println(count);
    }
}