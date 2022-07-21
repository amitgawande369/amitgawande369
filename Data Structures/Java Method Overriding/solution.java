import java.io.*;
import java.util.*;
class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}
class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
    
    void getNumberOfTeamMembers(){
        System.out.println("Each team has 11 players in Soccer Class");
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Sports s = new Sports();
        Soccer c = new Soccer();
        System.out.println(s.getName());
        s.getNumberOfTeamMembers();
        System.out.println(c.getName());
        c.getNumberOfTeamMembers();
    }
}
