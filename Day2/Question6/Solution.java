import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String C = in.next();
        char c = C.charAt(0);
        int strokes = 1;
        
        for(int i = 1 ; i < N ; i++)
        {
            if(c != C.charAt(i))
            {
                c = C.charAt(i);
                strokes += 1;
            }
        }
        
        System.out.print(strokes);
    }
}
