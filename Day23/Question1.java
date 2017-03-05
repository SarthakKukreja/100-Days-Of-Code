//https://www.hackerrank.com/contests/hourrank-18/challenges/wheres-the-marble


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        
        int[] arr = new int[11];
        arr[m] = 1;
        
        for(int a0 = 0; a0 < n; a0++){
            int a = in.nextInt();
            int b = in.nextInt();
            
            if(arr[a] == 1 || arr[b] == 1)
            {
                int temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
            }
        }

        for(int i = 1 ; i <= 10 ; i++)
        {
            if(arr[i] == 1)
            {
                System.out.println(i);
                break;
            }
        }
    }
}
