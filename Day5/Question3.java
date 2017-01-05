https://www.hackerrank.com/contests/101hack38/challenges/points-on-a-line

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int arr[][] = new int[n][2];
        
        for(int a0 = 0; a0 < n; a0++)
        {    
            for(int i = 0 ; i < 2 ; i++)
            {
                arr[a0][i] = in.nextInt();
            }
            
        }
        
        boolean xcheck = true;
        boolean ycheck = true;
        
        int x = arr[0][0];
        int y = arr[0][1];
        
        for(int a[] : arr)
        {
            if(a[0] != x)
            {
                xcheck = false;
            }
            
            if(a[1] != y)
            {
                ycheck = false;
            }
            
            if(!xcheck && !ycheck)
            {
                break;
            }
        }
        
        if(xcheck || ycheck)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
