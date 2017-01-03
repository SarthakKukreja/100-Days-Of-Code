/*

The Hacking Fiasco
Moderate, 100 points
: :
Hackers are trying to exploit the security of social networking sites. To do so, they have developed a program that accesses a server and captures details of the users. There are N users, numbered 1 to N, and the i th user is online in the time interval [Ci , Di ]. Due to security features, the program can be deployed only for a moment at one time. The program starts at time t and instantly captures the complete personal data of all the users that are online at that moment of time t and terminates immediately. You are given the execution times of a small series of K sequential attacks. Find the number of users that are affected. Not just one series of attacks, there are Q such series, so you have to find the answer for each of these Q series.
Input Format
The first line has an integer N. Each of the following N lines has two integers Ci Di . The next line has an integer Q, the number of attack series. Each of the following Q lines has information of one series of attacks. The first integer is K, the number of attacks in that group, followed by K integers in the same line, the integer deployment times t of the program.
Output Format
For each of the Q series, output the sum of the number of different users that the hackers gained access to, by using the program.
Constraints
1 <= N <= 99,999

1 <= Q <= 4,999

1 <= K <= 20

1 <= Ci, Di , t <= 99999999

Ci < Di
Sample Input
5
2 5
3 8
4 15
5 6
1 1
2
3 7 6 20
3 2 4 1
Sample Output
7
Explanation
Given online time of 5 people in the following closed intervals.

1. [2, 5 ]

2. [3, 8 ]

3. [4 , 15 ]

4. [ 5 , 6 ]

5. [1, 1]

In the first query, three attacks occur at t = 7, 6 and 20 and can download details for users 2, 3, 4.

In the second query, three attacks occur at t = 2, 4 and 1. They can learn all the details except 4.

Therefore, the output is 7.


*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner ip = new Scanner(System.in);
        int no_users = ip.nextInt();
        int[][] active = new int[no_users][2];
        
        for(int i = 0 ; i < no_users ; i++)
        {
            for(int j = 0 ; j < 2 ; j++)
            {
                active[i][j] = ip.nextInt();
            }
        }
        
        int no_attacks = ip.nextInt();
        int acc_compromised = 0;
        
        for(int i = 0 ; i < no_attacks ; i++)
        {
            int k = ip.nextInt();
            int[] arr = new int[no_users];
            for(int j = 0 ; j < k ; j++)
            {
                int attack_time = ip.nextInt();
                for(int z = 0 ; z < no_users ; z++)
                {
                    if(active[z][0] <= attack_time && active[z][1] >= attack_time)
                    {
                        arr[z] = 1;
                    }
                }
            }
            for(int a : arr)
            {
                acc_compromised += a;
            }
        }
        
       System.out.println(acc_compromised);
    }
}