package Array_DSA;

import java.util.Scanner;

public class Largest_Elements {
    static int getLargest(int n,int[] arr)
    {
        int maxi=arr[0];
        for (int i = 0; i < n ; i++) {
            maxi=Math.max(maxi,arr[i]);
           // if (arr[i]>max)
             //   max=arr[i];
        }
        return maxi;
    }
    static int getSmallest(int n, int[] arr)
    {
        int min=arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i]<min)
                min=arr[i];
        }
        return min;
    }
    public static void main(String[] args) {
        //int[] arr={9,12,31,23,43,32};
        Scanner input=new Scanner(System.in);
        System.out.println("Enter The size of an array: ");
        int n=input.nextInt();
        System.out.println("Enter the elements in array: ");
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextInt();
        }
        System.out.println("The Largest element in this array is: "+getLargest(n,arr));
        System.out.println("The smallest elements in this array is: " +getSmallest(n,arr));
    }
}
