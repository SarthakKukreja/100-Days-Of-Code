import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int reverse(int x)
    {
        int rev = 0;
        int digit;
        
        while(x > 0)
        {
          digit = x % 10;
          rev = rev * 10 + digit;
          x = x / 10;
        }
        
        return rev;
    }
    
    public static boolean check(int x,int k)
    {
        int rev = reverse(x);
        if((x - rev) % k == 0 || (rev - x) % k == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    public static void main(String[] args) {
        
        Scanner Sc = new Scanner(System.in);
        int i = Sc.nextInt();
        int j = Sc.nextInt();
        int k = Sc.nextInt();
        
        int count = 0;
        
        for(int a = i ; a <= j ; a++)
        {
            if(check(a,k))
            {
                count += 1;
            }
        }
        
        System.out.println(count);
    }
}