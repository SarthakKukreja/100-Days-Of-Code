/*

Suits
Easy, 100 points
: :
Ross is back from Federal Prison, and this time the prodigy works as a Consultant with Specter, the best attorney in New York City. Now this is a tough time at the firm because their clients are trying to relocate themselves and all their competitors are poaching them.
Harvey needs to win a pending case and now Mike is the only one who can help him. To help their client resolve the inside trading case, they aquired a special stock trading algorithm. This is a special algorithm which uses cryptography methods to prevent unsanctioned trading. This enciphering of stocks data is preventing Specter from using it. Ross, with his brilliant memory finds a way to decipher the first part of the algorithm. The trading algorithm works on indexing the nth trade data with the nth prime number, where n is the total number of data segments present. As the number of segments is large and time is limited you need to help Specter to locate the correct data segment.
Input Format
The input contains the value of n. ( the nth data segment)
Output Format
Output the index of that segment, i.e. the nth prime number.
Constraints
1<=n<=15000
Time limit: 2 sec
Memory limit: 64 MB
Sample Input
3
Sample Output
5
Explanation
5 is the 3rd Prime number.
*/




import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean prime(int a)
    {
      
      if( a == 1)
         return false;
       
      for(int i = 2 ; i < a ; i++)
      {
          if(a % i == 0)
          {
              return false;
          }
      }
        
      return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 1;
        int index  = 1;
        int cur = 2;
        
        while(index != n)
        {
            if(prime(count))
            {
                index += 1;
                cur = count;
            }
            
            count += 2;
        }
        
        System.out.println(cur);
    }
}
