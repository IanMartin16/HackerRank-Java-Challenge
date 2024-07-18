import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        Locale usLocale = new Locale("en", "US");
        Locale indiaLocale = new Locale("en", "IN");
        Locale chinaLocale = Locale.CHINA;
        Locale franceLocale = Locale.FRANCE;
        
        NumberFormat usFormatter = NumberFormat.getCurrencyInstance(usLocale);
        NumberFormat indiaFormatter = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat chinaFormatter = NumberFormat.getCurrencyInstance(chinaLocale);
        NumberFormat franceFormatter = NumberFormat.getCurrencyInstance(franceLocale);
        
        String us = usFormatter.format(payment);
        String india = indiaFormatter.format(payment);
        String china = chinaFormatter.format(payment);
        String france = franceFormatter.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}