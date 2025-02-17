// Q1: Reverse an array of floating point values
import java.util.*;

public class ReverseArray {
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

    public static void printArray(float[] arr) {
        for (float num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        float[] arr = {5.8f, 2.6f, 9.0f, 3.4f, 7.1f};
        System.out.println("Original array:");
        printArray(arr);
        reverse(arr);
        System.out.println("Reversed array:");
        printArray(arr);
    }
}

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
