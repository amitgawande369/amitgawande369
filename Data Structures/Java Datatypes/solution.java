import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        long a = 0;
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            try
            {
            a = sc.nextLong();
            System.out.println(a+ " can be fitted in:");
            if(a >= -128 && a <= 127)
            {
                System.out.println("* byte");
            }   
            if(a >= Short.MIN_VALUE && a <= Short.MAX_VALUE)
            {
                System.out.println("* short");
            }
            if(a >= Integer.MIN_VALUE && a <= Integer.MAX_VALUE)
            {
                System.out.println("* int");
            }
            if(a >= Long.MIN_VALUE && a <= Long.MAX_VALUE)
            {
                System.out.println("* long");
            }
            }
            // else 
            // {
            //     System.out.println("n can't be fitted anywhere.");
            // }
        
            catch(Exception e1)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
        }
    }
