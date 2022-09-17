package Array_DSA;

import java.util.Scanner;

public class sumof_Array {
    static int sum(int n,int[] arr)
    {
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum=sum + arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter The size of an array: ");
        int n=input.nextInt();
        System.out.println("Enter the elements in array: ");
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextInt();
        }
        System.out.println(sum(n,arr));
    }
}
