import java.util.*;

public class Solution {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // Create an array 'a' capable of holding 'n' integers
        int[] a = new int[n];

        // Read 'n' integers and save each value to the array 'a'
        for (int i = 0; i < n; i++) {
            int val = scan.nextInt();
            a[i] = val;
        }

        scan.close();

        // Prints each sequential element in array 'a'
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
