import java.util.*;

public class LabFinalQ1 {

    // Q1: Reverse function
    public static void reverse(float[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            float temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // Function to print an array
    public static void printArray(float[] arr) {
        for (float num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Q2: Positive divisors program
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
