//https://www.hackerrank.com/contests/101hack30/challenges/voting-1

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static String sort(String s1,String s2)
    {
        String big ;
        String small;
        
        if(s1.length() > s2.length())
        {
            big = s1;
            small = s2;
        }
        else
        {
            big = s2;
            small = s1;
        }
        
        for(int i = 0 ; i < small.length() ; i++)
        {
            if(s1.charAt(i) > s2.charAt(i))
            {
                return s1;
            }
            
            if(s1.charAt(i) < s2.charAt(i))
            {
                return s2;
            }
        }
        
        return small;
    }

    public static void main(String[] args) {
        
        Scanner Sc = new Scanner(System.in);
        
        int n = Sc.nextInt();
        String[] arr = new String[n];
            
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = Sc.next();
        }
        
        for(int i = 0 ; i < n ; i++ )
        {
            for(int j = 0 ; j < n - 1 ; j++)
            {
                if(sort(arr[j],arr[j + 1]) == arr[j])
                {
                    String s = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = s;
                }
            }
        }
        
        int count = 1;
        int win_count = 0;
        String prev = arr[0];
        String win = "";
        
        for(int i = 1 ; i < n ; i++)
        {

            if(arr[i].equals(prev))
            {
                count++;
            }
            else
            {
                if(count > win_count)
                {
                    win_count = count;
                    win = arr[i - 1];
                    count = 1;
                }
                else
                {
                    count = 1;
                }
            }
            prev = arr[i];
        }
        
        if(count > win_count)
        {
            System.out.println(arr[n - 1]);
        }
        else
        {
            System.out.println(win);
        }
    }
}