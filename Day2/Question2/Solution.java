import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        
        int num = 0;
        
        for(int i = 0 ; i < s.length() ; i++ )
        {
            if(s.charAt(i) == 'a')
            {
               num += 1;        
            }
        }
        
        
        long first_part = (long)(n / s.length()) ;
        first_part = first_part * num;
        
        long second_part = 0;
        long pos = (long)(n % s.length());
        for(int i = 0 ; i < pos ; i++)
        {
            if(s.charAt(i) == 'a')
            {
                second_part += 1;
            }
        }
        
        System.out.println(first_part + second_part);

    }
}
