
// Sum of elements in the array

import java.util.*;

public class Sum2 {

    public static int sumArray(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("\nEnter size of the array: ");
        n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element no. " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int answer = sumArray(arr, n);
        System.out.println("Sum of elements of array is: " + answer + "\n");

        sc.close();

    }
}
