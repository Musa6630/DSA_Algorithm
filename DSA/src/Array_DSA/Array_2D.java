package Array_DSA;

import java.util.Arrays;
import java.util.Scanner;

public class Array_2D {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //int n= input.nextInt();
        int[][] arr=new int[3][3];

        // Taking input in 2D array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col]=input.nextInt();
            }
        }
//        //Printing Output
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }

        //Printing Output
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
