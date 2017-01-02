import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int B[] = new int[N];
        int sum = 0;
        for(int B_i=0; B_i < N; B_i++){
            B[B_i] = in.nextInt();
            sum += B[B_i];
        }
        if(sum % 2 != 0)
        {
            System.out.println("NO");
        }
        
        else
        {
            int count = 0;
            for(int i = 0 ; i < N - 1 ; i++)
            {
                if( B[i] % 2 != 0)
                {
                    B[i]++;
                    B[i+1]++;
                    count++;
                }
            }
            
        System.out.print(count * 2);
            
        }
    }
}
