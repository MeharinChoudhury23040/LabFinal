// Q2: Positive divisors of a number
import java.util.*;

public class PositiveDivisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a positive integer (or 0 or negative to quit): ");
            int number = scanner.nextInt();

            if (number <= 0) {
                System.out.println("Program terminated.");
                break;
            }

            System.out.println("Positive divisors of " + number + " in decreasing order:");
            ArrayList<Integer> divisors = new ArrayList<>();

            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    divisors.add(i);
                }
            }

            Collections.sort(divisors, Collections.reverseOrder());
            for (int divisor : divisors) {
                System.out.println(divisor);
            }

            System.out.print("Would you like to enter another integer? (yes/no): ");
            String response = scanner.next();
            if (!response.equalsIgnoreCase("yes")) {
                System.out.println("Program terminated.");
                break;
            }
        }

        scanner.close();
    }
}
