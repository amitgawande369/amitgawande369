import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws Exception
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        //Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(br.readLine());
        int nsum = 0, count = 0;
        int[] arr = new int[n];
         String[] strs = br.readLine().trim().split("\\s+");
        for(int i = 0; i < n; i++)
        {
            arr[i] = Integer.parseInt(strs[i]);
           // System.out.print(arr[i]+" ");
        }
        for(int i = 0; i < arr.length; i++)
        {
            nsum = 0;
        for(int j = i; j < arr.length; j++)
        {
                nsum += arr[j];
                //System.out.print(arr[k]+" ");
                if(nsum < 0)
                {
                    count++;
                }
        }
        }
        System.out.println(count);
    }
}

