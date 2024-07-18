import java.io.*;
import java.util.*;

class Player{
    String name;
    int score;
    
    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}
class Checker implements Comparator<Player> {
    public int compare(Player a, Player b) {
        
        if(a.score != b.score) {
            return Integer.compare(b.score, a.score);
        } else {
            return a.name.compareTo(b.name);
        }
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        List<Player> players = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int score = scanner.nextInt();
            players.add(new Player(name, score));
        }
        Collections.sort(players, new Checker());
        
        for (Player player : players) {
            System.out.println(player.name + " " + player.score);
        }
        scanner.close();
    }
}