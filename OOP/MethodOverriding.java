import java.io.*;
import java.util.*;

class Sports {
    String getName() {
        return "Generic Sports";
    }
    void getNumberOfTeamMembers() {
        System.out.println("Each team has n players in " + getName());
    }
}
class Soccer extends Sports {
    @Override
    String getName() {
        return "Soccer Class";
    }
    @Override
    void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in " + getName());
    }
}


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Sports sports = new Sports();
        
        System.out.println(sports.getName());
        sports.getNumberOfTeamMembers();
        
        Soccer soc = new Soccer();
        System.out.println(soc.getName());
        soc.getNumberOfTeamMembers();
    }
}