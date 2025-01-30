import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for input
        int x = sc.nextInt(); 
        int y = sc.nextInt();

        // Relational Operators section
        System.out.println("Relational Operators:");
        System.out.println(x > y);  // Checks if x is greater than y
        System.out.println(x == y); // Checks if x is equal to y
        System.out.println(x < y);  // Checks if x is less than y
        System.out.println(x >= y); // Checks if x is greater than or equal to y
        System.out.println(x <= y); // Checks if x is less than or equal to y
    }
}