//https://www.hackerrank.com/contests/csback2school-practice/challenges/lonely-integer

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Question1 {
     private static int lonelyInteger(int[] a) {
        return 0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            count = count ^ a[i];
        }
        
        System.out.println(count);
    }

}
