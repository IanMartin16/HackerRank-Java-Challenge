import java.util.Scanner;
import java.util.HashMap;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Convert strings to lowercase for case-insensitive comparison
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Check if the lengths are equal
        if (a.length() != b.length()) {
            return false;
        }

        // Count occurrences of each character in both strings
        HashMap<Character, Integer> charCountA = new HashMap<>();
        HashMap<Character, Integer> charCountB = new HashMap<>();

        // Count occurrences in string a
        for (char ch : a.toCharArray()) {
            charCountA.put(ch, charCountA.getOrDefault(ch, 0) + 1);
        }

        // Count occurrences in string b
        for (char ch : b.toCharArray()) {
            charCountB.put(ch, charCountB.getOrDefault(ch, 0) + 1);
        }

        // Compare character counts
        return charCountA.equals(charCountB);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        
        boolean ret = isAnagram(a, b);
        System.out.println(ret ? "Anagrams" : "Not Anagrams");
    }
}
