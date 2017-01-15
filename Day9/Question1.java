//https://www.hackerrank.com/contests/101aug14/challenges/pangrams

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Question1 {

    public static void main(String[] args) {
        
        Scanner Sc = new Scanner(System.in);
        String main =    Sc.nextLine();
        main = main.toLowerCase();
        
        String parent = "abcdefghijklmnopqrstuvwxyz";
        
        int[] arr = new int[26];
        
        for(int i = 0 ; i < main.length() ; i++)
        {
            if(main.charAt(i) == ' ')
            {
                continue;
            }
            arr[parent.indexOf(main.charAt(i))] += 1;
        }
        
        boolean check = true;
        
        for(int i = 0 ; i < 26 ; i++)
        {
            if(arr[i] == 0)
            {
                check = false;
                System.out.println("not pangram");
                break;
            }
        }
        
        if(check)
        {
            System.out.println("pangram");
        }
    }
}