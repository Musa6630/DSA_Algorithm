package Array_DSA;

import java.util.Scanner;

public class All_Duplicates {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter The size of an array: ");
        int n=input.nextInt();
        System.out.println("Enter the elements in array: ");
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextInt();
        }
    }
}
