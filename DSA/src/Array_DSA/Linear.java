package Array_DSA;

import java.util.Scanner;

public class Linear {
    static boolean search(int n,int[] arr, int elements)
    {
        for (int i = 0; i < n; i++) {
            if (arr[i]==elements)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n= input.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= input.nextInt();
        }
        System.out.println("Enter the elements to be searched: ");
        int elements= input.nextInt();
        System.out.println(search(n,arr,elements));

        if (search(n, arr, elements))
            System.out.println("this is true");
        else
            System.out.println("NOT found");

    }
}
