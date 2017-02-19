//https://www.hackerrank.com/contests/rookierank-2/challenges/hackerrank-in-a-string

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        String main = "hackerrank";
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
        
        int index = 0;
        boolean check = false;
            
        for(int i = 0 ; i < s.length() ; i++)
        {
            if(s.charAt(i) == main.charAt(index))
            {
                index++;
            }
            
            if(index == (main.length() - 1))
            {
                check = true;
                break;
            }
        }
            
       if(check)
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
