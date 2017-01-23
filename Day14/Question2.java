//https://www.hackerrank.com/contests/w2/challenges/manasa-and-stones

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        
        Scanner Sc = new Scanner(System.in);
        int test = Sc.nextInt();
        
        for(int j = 0 ; j < test ; j++)
        {
            int n = Sc.nextInt();
            int a = Sc.nextInt();
            int b = Sc.nextInt();
            
            int n1 = 0;
            int n2 = n - 1;
           
            int[] arr = new int[n];
            int index = 0;
            
            while(n1 != (n))
            {
                arr[index++] = (a * n1) + (b * n2) ;
                n1++;
                n2--;
            }
            
            for(int i = 0 ; i < n  ; i++)
            {
                for(int k = 0 ; k < n - 1 ; k++)
                {
                    if(arr[k] > arr[k + 1])
                    {
                        int temp = arr[k];
                        arr[k] = arr[k + 1];
                        arr[k + 1] = temp;
                    }
                }
            }
            
            int prev = -1;
            
            for(int d : arr)
            {
                if(d == prev)
                {
                   continue;
                }
                System.out.print(d + " ");
                prev = d;
            }
            
            System.out.println();
        }
    }
}