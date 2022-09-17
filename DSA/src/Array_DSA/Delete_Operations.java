package Array_DSA;

import java.util.Scanner;

public class Delete_Operations {
    static int delete(int arr[], int n, int x)
    {
        int i = 0;

        for(i = 0; i < n; i++)
        {
            if(arr[i] == x)
                break;
        }

        if(i == n)
            return n;

        for(int j = i; j < n - 1; j++)
        {
            arr[j] = arr[j + 1];
        }

        return n-1;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n=input.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr=new int[n];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]= input.nextInt();
        }
        System.out.println("Eneter the elements to be delete: ");
        int x= input.nextInt();

        System.out.println("Before deletion: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        n = delete(arr, n, x);

        System.out.println("After Deletion");

        for(int i=0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
