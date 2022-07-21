import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new LinkedList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            list.add(sc.nextInt());
        }
        int q = sc.nextInt();
        for(int i = 0; i < q; i++)
        {
            String s = sc.next();
            if(s.equals("Insert"))
            {
                int a = sc.nextInt();
                int b = sc.nextInt();
                list.add(a,b);
            }
            else if(s.equals("Delete"))
            {
                int c = sc.nextInt();
                list.remove(c);
            }
        }
        for(Integer k : list)
        {
            System.out.print(k+ " ");
        }
    }
}
