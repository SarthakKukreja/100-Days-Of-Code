//https://www.hackerrank.com/contests/world-codesprint-8/challenges/climbing-the-leaderboard
//3 Cases timing out.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for(int scores_i=0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int alice_i=0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }
        // your code goes here
        
        int pos = 1;
        int prev = -1;
        int index = 0;
        int i = 0;
        
        int max;
        
        if(m > n)
        {
            max = m;
        }
        else
        {
            max = n;
        }
        
        while(i < m)
        {
            
            if(index == max - 1)
            {
               System.out.println(pos + 1);
               i++;
               index = 0;
               prev = -1;
               pos = 1;
               m = m - pos + 1;
               continue;
            }
            
            if(scores[index] == prev)
                
            {
                index++;
                continue;
            }
            
            prev = scores[index];
            
            if(alice[i] < scores[index])
            {
                pos++;
                index++;
            }
            else
            {
               System.out.println(pos);
               i++;
               index = 0;
               prev = -1;
               pos = 1;
               m = m - pos + 1;
            }
            
  
        }
    }
}

