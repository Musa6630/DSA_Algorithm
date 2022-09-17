package Array_DSA;

import java.util.Scanner;

public class Search_Operations {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n=input.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in an Array");
        for (int i = 0; i < arr.length ; i++) {
            arr[i]= input.nextInt();
        }
        System.out.println("Enter the elements to be searched");
        int x=input.nextInt();

//        int x=4;
        System.out.println(search(arr, n, x));

    }
    static int search(int arr[],int n, int x)
    {

        for (int i = 0; i <n ; i++) {

            if (arr[i]==x)
                return i;
        }
        return -1;
    }

}

