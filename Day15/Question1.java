//https://www.hackerrank.com/contests/w10/challenges/alternating-characters

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        for(int t1 = 0 ; t1 < t ; t1++)
        {
            String s = Sc.next();
            int count = 0;
            char prev = ' ';
            
            for(int i = 0 ; i < s.length() ; i++)
            {
                if(s.charAt(i) == prev)
                {
                    count += 1;
                }
                
                prev = s.charAt(i);
            }
            
            System.out.println(count);
        }
    }
}