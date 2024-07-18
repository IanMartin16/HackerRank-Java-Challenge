import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two numbers as strings
        String num1Str = scanner.nextLine();
        String num2Str = scanner.nextLine();

        // Convert strings to BigInteger objects
        BigInteger num1 = new BigInteger(num1Str);
        BigInteger num2 = new BigInteger(num2Str);

        // Perform addition and multiplication
        BigInteger sum = num1.add(num2);
        BigInteger product = num1.multiply(num2);

        // Print the results
        System.out.println(sum);
        System.out.println(product);

        scanner.close();
    }
}
