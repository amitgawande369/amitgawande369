import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = sc.next();
        System.out.println(s.length()+s1.length());
        if(s.compareTo(s1) > 0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        System.out.println(s.substring(0, 1).toUpperCase()+s.substring(1, s.length())+ " " +s1.substring(0, 1).toUpperCase()+s1.substring(1, s1.length()));
    }
}
