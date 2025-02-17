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
