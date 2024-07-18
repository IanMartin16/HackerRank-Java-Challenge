import java.math.BigDecimal;
import java.util.*;

class Solution {
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        // Crear una lista de pares (BigDecimal, String)
        List<Pair> decimalList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            decimalList.add(new Pair(new BigDecimal(s[i]), s[i]));
        }

        // Ordenar la lista de pares en orden descendente basado en BigDecimal
        Collections.sort(decimalList, (a, b) -> b.value.compareTo(a.value));

        // Output
        for (Pair pair : decimalList) {
            System.out.println(pair.original);
        }
    }

    static class Pair {
        BigDecimal value;
        String original;

        Pair(BigDecimal value, String original) {
            this.value = value;
            this.original = original;
        }
    }
}
