import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int n = scanner.nextInt();

        // Read the elements of the array
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Find and print the number of negative subarrays
        int countNegativeSubarrays = findNegativeSubarrays(array);
        System.out.println(countNegativeSubarrays);

        scanner.close();
    }

    // Function to find the number of negative subarrays
    private static int findNegativeSubarrays(int[] array) {
        int count = 0;

        // Iterate through all possible subarrays
        for (int i = 0; i < array.length; i++) {
            int currentSum = 0;

            // Check subarrays starting from index i
            for (int j = i; j < array.length; j++) {
                currentSum += array[j];

                // If the sum is negative, increment the count
                if (currentSum < 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
