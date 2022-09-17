package Array_DSA;

import java.util.Scanner;

public class Reverse_Arraystring {
    static void reverse(int n, String[] arr)
    {
        int start=0;
        int end=n-1;
        while (start<end)
        {
            String temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter The size of an array: ");
        int n=input.nextInt();
        System.out.println("Enter the elements in array: ");
        String[] arr=new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextLine();
        }
        System.out.println("Before reversing: ");
        for (String j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        reverse(n,arr);
        System.out.println("After Reversing: ");
        for (String j : arr) {
            System.out.print(j + " ");
        }
    }
}

