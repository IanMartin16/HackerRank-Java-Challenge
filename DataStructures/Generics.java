import java.io.*;
import java.util.*;

public class Solution {

    public static <T> void printArray(T[] array) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        for(T element : array) {
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        printArray(intArray);
             
        String[] stringArray = {"Hello", "World"};
        printArray(stringArray);
    }
    
}