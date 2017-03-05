//https://www.hackerrank.com/contests/university-codesprint-2/challenges/breaking-best-and-worst-records

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i=0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        
        int max = score[0];
        int min = score[0];
        
        int max_count = 0;
        int min_count = 0;
        
        for(int i = 1 ; i < n ; i++)
        {
            if(score[i] > max)
            {
                max_count++;
                max = score[i];
            }
            else if(score[i] < min)
            {
                min_count++;
                min = score[i];
            }
        }
        
        System.out.println(max_count + " " + min_count);
    }
}
