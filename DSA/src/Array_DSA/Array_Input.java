package Array_DSA;

import java.util.Scanner;

public class Array_Input {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the size of array; ");
        int n=input.nextInt();
        int[] arr=new int[n];
        Scanner in=new Scanner(System.in);
        for (int i = 0; i < arr.length ; i++) {
            arr[i]= in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
