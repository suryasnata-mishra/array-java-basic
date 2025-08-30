
// Using functions

import java.util.Arrays;

public class Arrays3 {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 4, 5};
       
        System.out.println("\n" + Arrays.toString(arr) + "\n");
        change1(arr);
        System.out.println(Arrays.toString(arr) + "\n");
        change2(arr);
        System.out.println(Arrays.toString(arr) + "\n");

    }
    static void change1(int[] arr){
       arr[0] = 69;
    }
    static void change2(int[] arr){
        arr[4] = 699;
    }
    
}
