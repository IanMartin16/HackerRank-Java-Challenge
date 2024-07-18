import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; i++) {
            String currentSubstring = s.substring(i, i + k);
            
            // Compare with the current smallest substring
            if (currentSubstring.compareTo(smallest) < 0) {
                smallest = currentSubstring;
            }
            
            // Compare with the current largest substring
            if (currentSubstring.compareTo(largest) > 0) {
                largest = currentSubstring;
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
