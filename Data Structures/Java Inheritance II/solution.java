import java.io.*;
import java.util.*;
class Arithmetic
{
    int add(int a, int b)
    {
        return (a+b);
    }
}
class adder extends Arithmetic
{
    
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        adder ad =new adder();
        System.out.println("My superclass is: " + ad.getClass().getSuperclass().getName()); 
        System.out.print(ad.add(10,32) + " " + ad.add(10,3) + " " + ad.add(10,10) + "\n");
    }
}
