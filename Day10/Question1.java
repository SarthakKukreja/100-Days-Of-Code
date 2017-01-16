//https://www.hackerrank.com/contests/w6/challenges/acm-icpc-team

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int no_topics(String s1,String s2)
    {
        int[] arr = new int[s1.length()];
        for(int i = 0 ; i < s1.length() ; i++)
        {
            if(s1.charAt(i) == '1' || s2.charAt(i) == '1')
            {
                arr[i] = 1;
            }
        }
        
        int nof_topics = 0;
        
        for(int i = 0 ; i < s1.length() ; i++)
        {
            if(arr[i] == 1)
            {
                nof_topics++; 
            }
        }
        
        
        return nof_topics;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String topic[] = new String[n];
        for(int topic_i=0; topic_i < n; topic_i++){
            topic[topic_i] = in.next();
        }
        
        int max = 0;
        int num = 0;
        
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = i + 1 ; j < n ; j++)
            {
                int a = no_topics(topic[i],topic[j]);
                if(a > max)
                {
                    max = a;
                    num = 1;
                }
                else if(a == max)
                {
                    num++;
                }
                
            }
        }
        
        System.out.println(max);
        System.out.println(num);
        
    }
}
