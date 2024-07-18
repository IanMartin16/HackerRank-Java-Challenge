import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of lines
        int n = scanner.nextInt();

        // Create an ArrayList to store the lines
        List<List<Integer>> lines = new ArrayList<>();

        // Read the lines and store them in the ArrayList
        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();
            List<Integer> line = new ArrayList<>();

            for (int j = 0; j < d; j++) {
                line.add(scanner.nextInt());
            }

            lines.add(line);
        }

        // Read the number of queries
        int q = scanner.nextInt();

        // Process queries
        for (int k = 0; k < q; k++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            // Handle the case where the line x does not exist
            if (x > 0 && x <= n) {
                List<Integer> line = lines.get(x - 1);

                // Handle the case where the position y does not exist
                if (y > 0 && y <= line.size()) {
                    System.out.println(line.get(y - 1));
                } else {
                    System.out.println("ERROR!");
                }
            } else {
                System.out.println("ERROR!");
            }
        }

        scanner.close();
    }
}
