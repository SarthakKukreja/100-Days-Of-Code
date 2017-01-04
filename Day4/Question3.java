//https://www.hackerrank.com/contests/101jan14/challenges/filling-jars/copy-from/8348474

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner Sc = new Scanner(System.in);
        long n = Sc.nextInt();
        long m = Sc.nextInt();
        
        long sum = 0;
        
        for(int i = 0 ; i < m ; i++)
        {
            long a = Sc.nextLong();
            long b = Sc.nextLong();
            long k = Sc.nextLong();
            
            sum += ((b - a) + 1) * k ;
        }
        
        sum = sum / n;
        System.out.println(sum);
    }
}