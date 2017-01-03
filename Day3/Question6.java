//https://www.hackerrank.com/contests/101hack41/challenges/lecture-notes

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Question6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String s = in.next();
        int friends[] = new int[k];
        for(int friends_i=0; friends_i < k; friends_i++){
            friends[friends_i] = in.nextInt();
        }
        
       boolean check = false;
       for(int a : friends)
       {
           if(s.charAt(a - 1) == '0')
           {
               check = true;
           }    
       }
        
       if(check)
       {
           System.out.println("YES");
       }
       else
       {
           System.out.println("NO");
       }
            
    }
}
