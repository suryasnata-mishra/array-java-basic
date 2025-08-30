
/*

   Syntax
 Data type[] variable_name = new datatype[size];
 ex: int[] rollNo = new int[5];
 or directly : int[] rollNo = {23 , 34 ,45 , 69};

INPUT

*/

import java.util.Scanner;
class Arrays1{
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    int n;
    System.out.print("\nEnter length of array = ");
    n = in.nextInt();

    int arr[] = new int[n];

    for(int i = 0; i < arr.length; i++){
        arr[i] = in.nextInt();
    }
    System.out.print("\nYour array is: \n");
    for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i] + " ");
    }
    }
}

// or

/*
 
import java.util.Scanner;

class Arrays1{
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);

       int n;
       System.out.print("Enter length of the array = ");
       n = in.nextInt();

       int[] arr = new int[n];

       for(int i = 0; i < arr.length; i++){
         arr[i] = in.nextInt();
       }
       // Enhanced for loop
       for(int j : arr){ // For every element in the array print the element
        System.out.print(j + " "); // j represents elements of the array
       }
       in.close();

    }
}

or 

import java.util.Arrays;
import java.util.Scanner;

class Arrays1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("\nEnter length of the array = ");
        n = in.nextInt();

        int[] bracket = new int[n];
        for (int i = 0; i < bracket.length; i++) {
            System.out.print("Enter element no " + (i + 1) + " = ");
            bracket[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(bracket)); 
        // This is a enhanced for loop pro version which will print & also add bracket at first & last of the input of the array
        in.close();

    }
}

*/