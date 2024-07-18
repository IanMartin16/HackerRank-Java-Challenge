import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()) {
            String expression = scanner.nextLine();
            System.out.println(isBalanced(expression)? "true" : "false");
        }
        scanner.close();
    }
    private static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        
        for(char ch : expression.toCharArray()) {
            if(ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if(stack.isEmpty()) {
                    return false;
                }
                char openingBracket = stack.pop();
                
                if (ch == ')' && openingBracket != '(' ||
                ch == ']' && openingBracket != '[' ||
                ch == '}' && openingBracket != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}