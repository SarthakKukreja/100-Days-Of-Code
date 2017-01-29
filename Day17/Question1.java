//https://www.hackerrank.com/contests/101hack31/challenges/naughty-number

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int y = 2*n + 1;
        int x = 0;
        
        for(int i = 0 ; i < y ; i++)
        {
            x = x ^ Sc.nextInt();
        }
        
        System.out.println(x);
    }
}

