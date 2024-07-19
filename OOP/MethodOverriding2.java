import java.io.*;
import java.util.*;

class Cycle {
    String define_me() {
        return "I am a cycle with pedals.";
    }
}

class Bike extends Cycle {
    String define_me() {
        return "Hello I am a motorcycle, I am a cycle with an engine.";
    }
    Bike() {
        System.out.println(define_me());
        System.out.println("My ancestor is a cycle who is a vehicle with pedals.");
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Bike M = new Bike();
        
    }
}