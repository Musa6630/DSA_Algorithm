package Array_DSA;

import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class Efficiend_SecondLargest {
    static int SecondLargest(int n, int [] arr)
    {
        int res=-1,largest=0;
        for (int i = 1; i <n ; i++)
        {
            if (arr[i]>arr[largest])
            {
                res=largest;
                largest=i;
            }
            else if (arr[i]!=arr[res])
            {
                if (res==-1||arr[i]>arr[res])
                    res=i;
            }
        }
        return res;
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
        SecondLargest(n,arr);
    }

}
