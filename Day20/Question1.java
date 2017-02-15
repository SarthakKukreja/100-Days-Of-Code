//https://www.hackerrank.com/contests/rookierank-2/challenges/migratory-birds
//Time Complexity is high.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n];
        for(int types_i=0; types_i < n; types_i++){
            types[types_i] = in.nextInt();
        }
        
        for(int i = 0 ; i < n  ; i++)
        {
            for(int j = i + 1 ; j < n ; j++)
            {
                if(types[i]> types[j])
                {
                    int temp = types[j];
                    types[j]= types[i];
                    types[i] = temp;
                }
            }
        }
        
        int count = 1;
        int max_count = -1;
        int max_num = -1;
        int prev = types[0];
        
        for(int i = 1 ; i < n ; i++)
        {
            if(prev == types[i])
            {
                count += 1;
            }
            else
            if(count >= max_count)
            {
                max_count = count;
                max_num = types[i - 1];
                count = 1;
            }
            
            prev = types[i];
        }
        
        if(count + 1 >= max_count)
        {
            max_num = types[n - 1];
        }
        
        System.out.println(max_num);
    }
}
