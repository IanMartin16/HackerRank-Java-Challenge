import java.io.*;
import java.util.*;

class Arithmetic {
    int add (int a, int b){
        return a + b;
    }
    
}
class Adder extends Arithmetic {
    
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Adder adder = new Adder();
        System.out.println("My superclass is: " + adder.getClass().getSuperclass().getName());
        System.out.println(adder.add(10, 32) + " " + adder.add(7, 6) + " " + adder.add(10, 10));
    
    }
}