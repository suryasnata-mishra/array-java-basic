
// Two pointers approach

import java.util.*;

public class Reverse4 {

    public static void reverseArray(int[] arr, int n) {
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.print("Reversed array: ");
        for (var num1 : arr) {
            System.out.print(num1 + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("\nEnter size of array: ");
        n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element no. " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
 
        System.out.print("\nGiven array: ");
        for (var num2 : arr) {
            System.out.print(num2 + " ");
        }
         
        System.out.println();
        reverseArray(arr, n);
        System.out.println("\n");
        sc.close();

    }

}
