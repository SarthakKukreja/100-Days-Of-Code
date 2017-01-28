//https://www.hackerrank.com/contests/world-codesprint-9/challenges/weighted-uniform-string

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        int arr[] = new int[s.length()];
        int index = 0;
        int count = 1;
        char prev = s.charAt(0);
        
        for(int i = 1 ; i < s.length() ; i++)
        {
            
            arr[index++] = count * ( ((int) (prev - 'a') ) + 1 ) ;
            
            if( prev != s.charAt(i) )
            {
                count = 1;
            }
            else
            {
                count++;
            }
            
            prev = s.charAt(i);
            
        }
        
        arr[index++] = count * ( ((int) (prev - 'a') ) + 1 ) ;
        
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int x = in.nextInt();
            
            boolean check = false;
            
            for(int a : arr )
            { 
                if(a == x )
                {
                    check = true;
                    break;
                }
            }
            
            if(check)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}

