import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        
        StringBuffer Obj = new StringBuffer(B);
        int count = 0;
        
        for(int i = 0 ; i < Obj.length() - 2 ; i++)
        {
            if(Obj.charAt(i) == '0')
            {
                if(Obj.charAt(i + 1) == '1')
                {
                    if(Obj.charAt(i + 2) == '0')
                    {
                        Obj.setCharAt(i + 2 , '1');
                        count += 1;
                        i = i + 2;
                    }
                }
            }
        }
        
        System.out.println(count);
    }
}
