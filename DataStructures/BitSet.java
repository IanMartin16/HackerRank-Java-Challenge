import java.util.BitSet;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read N (size of BitSets) and M (number of operations)
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        // Initialize two BitSets of size N
        BitSet B1 = new BitSet(N);
        BitSet B2 = new BitSet(N);
        
        // Perform M operations
        for (int i = 0; i < M; i++) {
            String operation = sc.next();
            int arg1 = sc.nextInt();
            int arg2 = sc.nextInt();
            
            switch (operation) {
                case "AND":
                    if (arg1 == 1) {
                        B1.and(B2);
                    } else {
                        B2.and(B1);
                    }
                    break;
                case "OR":
                    if (arg1 == 1) {
                        B1.or(B2);
                    } else {
                        B2.or(B1);
                    }
                    break;
                case "XOR":
                    if (arg1 == 1) {
                        B1.xor(B2);
                    } else {
                        B2.xor(B1);
                    }
                    break;
                case "FLIP":
                    if (arg1 == 1) {
                        B1.flip(arg2);
                    } else {
                        B2.flip(arg2);
                    }
                    break;
                case "SET":
                    if (arg1 == 1) {
                        B1.set(arg2);
                    } else {
                        B2.set(arg2);
                    }
                    break;
            }
            
            // Print the number of set bits in B1 and B2
            System.out.println(B1.cardinality() + " " + B2.cardinality());
        }
        
        sc.close();
    }
}
