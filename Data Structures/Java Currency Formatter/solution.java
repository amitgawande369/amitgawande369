//import java.io.*;
import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        NumberFormat usno = NumberFormat.getCurrencyInstance(Locale.US);
        String us = usno.format(n);
        System.out.println("US: " +us); 
        NumberFormat inno = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String in = inno.format(n);
        System.out.println("India: " +in); 
        NumberFormat chno = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String ch = chno.format(n);
        System.out.println("China: " +ch); 
        NumberFormat frno = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String fr = frno.format(n);
        System.out.println("France: " +fr); 
        
    }
}
