//https://www.hackerrank.com/contests/oct13/challenges/chocolate-feast

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Question3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for(int a0 = 0; a0 < t; a0++){
            
            int total = 0;
            
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            
            int wrappers = 0;
            total = total += (n / c);
            wrappers = wrappers += (n / c);
            while(wrappers >= m)
            {
                total = total += (wrappers / m);
                wrappers = (wrappers / m) + (wrappers % m) ;
            }
            
            
            System.out.println(total);
        }
    }
}
