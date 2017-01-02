import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int difference(int num1,int num2)
    {
        if(num1 > num2)
            return num1 - num2;
        else
            return num2 - num1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            
            if( difference(x,z) < difference(y,z))
                System.out.println("Cat A");
            else
            if( difference(x,z) > difference(y,z))
                System.out.println("Cat b");
            else
                System.out.println("Mouse C");
        }
    }
}
