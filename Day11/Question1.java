//https://www.hackerrank.com/contests/world-codesprint-8/challenges/snake-case

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Question1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        int underscores = 0;
        
        for(int i = 0 ; i < s.length() ; i++)
        {
            if(s.charAt(i) == '_')
            {
                underscores += 1;
            }
        }
        
        System.out.println(underscores + 1);
    }
}
