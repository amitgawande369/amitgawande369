import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int h = sc.nextInt();
        if(b <= 0 || b >100 || h <=0 || h > 100)
        {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else 
        {
            System.out.println(b * h);
        }
    }
}
