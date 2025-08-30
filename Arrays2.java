
// Array of objects

import java.util.Arrays;
import java.util.Scanner;
public class Arrays2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = new String[5];

        for(int i = 0; i < str.length; i++){
          System.out.print("Enter element no " + (i+1) + " = ");
          str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(str));
    }
}
