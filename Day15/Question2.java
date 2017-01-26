//https://www.hackerrank.com/contests/w12/challenges/priyanka-and-toys

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int[] arr = new int[n];
        int[] visited = new int[10001];
        
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = Sc.nextInt();
            visited[arr[i]] = 1;
        }
            
        int count = 0;
        
        for(int i = 1 ; i < 10001 ; i++)
        {
            if(visited[i] == 1)
            {
                count += 1;
                
                for(int j = 0 ; j <= 4 ; j++)
                {
                    visited[i + j] = 0;
                }   
            }
        }
        
        System.out.println(count);
        
    }
}