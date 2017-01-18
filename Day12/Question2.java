//https://www.hackerrank.com/contests/world-codesprint-6/challenges/bon-appetit

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int not_eaten = Sc.nextInt();
        int total = 0;
        
        int[] arr = new int[n];
        
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = Sc.nextInt();
            
            if(i == not_eaten)
            {
                continue;
            }
            
            total += arr[i];
        }
        total = total / 2;
        int cost = Sc.nextInt();
        
        if(cost == total)
        {
            System.out.println("Bon Appetit");
        }
        else
        {
            System.out.println(cost - total);
        }
        
    }
}