import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
        //sb.append(s);
        if(s.equals(sb.reverse().toString()))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
