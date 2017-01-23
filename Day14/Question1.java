//https://www.hackerrank.com/contests/w3/challenges/the-love-letter-mystery

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
        
        for(int j = 0 ; j < n ; j++)
        {
            String a = Sc.next();
            int count = 0;
            
            int index = 0;
            
            for(int i = 0 ; i < a.length() / 2 ; i++)
            {
                if(a.charAt(i) == a.charAt(a.length() - 1 - i))
                {
                    continue;
                }
                else
                if(a.charAt(i) > a.charAt(a.length() - 1 - i))
                {
                    count += (a.charAt(i) - a.charAt(a.length() - 1 - i));
                }
                else
                {
                    count += (a.charAt(a.length() - 1 - i)) - a.charAt(i);
                }
                
            }
            
            System.out.println(count);
        }
    }
}
