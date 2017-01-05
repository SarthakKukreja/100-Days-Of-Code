// https://www.hackerrank.com/contests/101hack35/challenges/save-the-prisoner

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner Sc = new Scanner(System.in);
        
        int test_cases = Sc.nextInt();
        
        for(int i = 0 ; i < test_cases ; i++)
        {
            int n = Sc.nextInt();
            int m = Sc.nextInt();
            int s = Sc.nextInt();
            
             s = (m - 1 + s - 1) % n + 1;
             
            System.out.println(s);
        }
    }
}