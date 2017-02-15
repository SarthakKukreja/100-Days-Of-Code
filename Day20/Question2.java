//https://www.hackerrank.com/challenges/insertionsort1?h_r=next-challenge&h_v=zen
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void insertIntoSorted(int[] ar) {
        
        int n = ar.length;
        
        int k = ar[n - 1];
        boolean check = true;
        
        for(int i = n - 2 ; i >= 0 ; i--)
        {
            if(k >= ar[i])
            {
                ar[i + 1] = k;
                printArray(ar);
                check = false;
                break;
            }
            else
            {
                ar[i + 1] = ar[i];
            }
            printArray(ar);
        }
        
        if(check)
        {
            ar[0] = k;
            printArray(ar);
        }
    }
    
/* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
 
