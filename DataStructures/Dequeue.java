import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scanner = new Scanner(System.in);
    
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    
    Set<Integer> uniqueSet = new HashSet<>();
    
    Deque<Integer> deque = new LinkedList<>();
    
    for(int i = 0; i < m; i++) {
        int num = scanner.nextInt();
        uniqueSet.add(num);
        deque.addLast(num);
    }
    int maxUniqueCount = uniqueSet.size();
    
     for(int i = m; i < n; i++) {
        int num = scanner.nextInt();
        
        int removed = deque.removeFirst();
        if(!deque.contains(removed)) {
            uniqueSet.remove(removed);
        }
        
        deque.addLast(num);
        uniqueSet.add(num);
        
        maxUniqueCount = Math.max(maxUniqueCount, uniqueSet.size());
     }
     System.out.println(maxUniqueCount);
    
     scanner.close();
    
    }
}