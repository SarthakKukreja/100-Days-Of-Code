import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        
        long time = 0;
        long time_skip = 3;
        
        while(time + time_skip < t)
        {
            time = time + time_skip;
            time_skip = time_skip * 2;
        }
        
        long difference = t - time;
        
        System.out.println(time_skip - difference + 1);
    }
}
