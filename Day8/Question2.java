//https://www.hackerrank.com/contests/rookierank/challenges/counting-valleys

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        String steps = Sc.next();
        
        int net = 0;
        int prev = 0;
        int valleys = 0;
        
        for(int i = 0 ; i < steps.length() ; i++)
        {
            prev = net;
            
            if(steps.charAt(i) == 'U')
            {
                net += 1;
            }
            else
            {
                net -= 1; 
            }
            if(net == 0 && prev == -1)
            {
                valleys += 1;
            }
        }
        
        System.out.println(valleys);
    }
}