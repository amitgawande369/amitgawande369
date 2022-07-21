import java.io.*;
import java.util.*;
abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
class MyBook extends Book
{
    void setTitle(String s)
    {
        System.out.println("The title is: "+s);
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String d = sc.nextLine();
        MyBook b =new MyBook();
        b.setTitle(d);
    }
}
