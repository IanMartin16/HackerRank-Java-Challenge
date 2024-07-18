import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        // Reading input array
        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        // Calculate and print the largest sum among all hourglasses
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int currentSum = calculateHourglassSum(arr, i, j);
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        System.out.println(maxSum);
    }

    // Calculate sum of hourglass at given position (i, j)
    private static int calculateHourglassSum(List<List<Integer>> arr, int i, int j) {
        return arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2)
             + arr.get(i + 1).get(j + 1)
             + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
    }
}
