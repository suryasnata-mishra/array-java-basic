
import java.util.*;

public class Reverse3 {

    public static void reverseArray(int[] arr, int n) {
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i] = arr[n - 1 - i];
        }

        for (int j = 0; j < n; j++) {
            arr[j] = temp[j];
        }

        System.out.print("Reversed array is: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n;
        System.out.print("\nEnter size of array: ");
        n = in.nextInt();

        int[] arr = new int[n];

        System.out.println();
        for (int k = 0; k < n; k++) {
            System.out.print("Enter element no. " + (k + 1) + ": ");
            arr[k] = in.nextInt();
        }

        System.out.println();

        // Current Array
        System.out.print("Current array is: ");
        for (var num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        reverseArray(arr, n);
        System.out.println();

        in.close();
    }
}
