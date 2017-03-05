//https://www.hackerrank.com/contests/acm-manipal-codejam/challenges/acm-party

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        
        for(int i = 0 ; i < n ; i++)
        {
            String c = Sc.next();
            int[] arr = new int[26];
            int max = -1;
            int sum = 0;
            
            for(int j = 0 ; j < c.length() ; j++)
            {
                arr[(int)(c.charAt(j)) - 'a']++;
            }
            
            for(int j = 0 ; j < 26 ; j++)
            {
                sum += arr[j];
                if(arr[j] > max)
                {
                    max = arr[j];
                }
            }
            
            if((sum - max) == max)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            
            
        }
    }
}
