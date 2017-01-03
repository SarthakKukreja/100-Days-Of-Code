//https://www.hackerrank.com/contests/hourrank-5/challenges/ann-jimmy

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Question2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int length;
        int breadth;
        int height;
        
        if(n < 3 && n > 0)
        {
            length  = breadth = height = 1;
        }
        else
        if(n % 3 == 0)
        {
            length = breadth = height = n / 3;
        }
        else
        if(n % 3 == 1)
        {
            length = breadth = n / 3;
            height = length + 1;
        }
        else
        {
            length = n / 3;
            height = breadth = length + 1;
        }
        
        System.out.println(height * breadth * length);
    }
}
