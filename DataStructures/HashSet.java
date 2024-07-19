import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();
        
        scanner.nextLine();
        
        Set<String> uniquePairs = new HashSet<>();
        
        for(int i = 0; i < T; i++) {
            String pair = scanner.nextLine();
            uniquePairs.add(pair);
            System.out.println(uniquePairs.size());
        }
        scanner.close();
    }
}