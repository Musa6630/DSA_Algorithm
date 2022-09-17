package Array_DSA;

import java.util.Scanner;

public class Reverse_Array {
    static void reverse(int n, int[] arr)
    {
        int start=0;
        int end=n-1;
        while (start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter The size of an array: ");
        int n=input.nextInt();
        System.out.println("Enter the elements in array: ");
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextInt();
        }



        System.out.println("Before reversing: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        reverse(n,arr);
        System.out.println("After Reversing: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
