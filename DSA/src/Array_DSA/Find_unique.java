package Array_DSA;

import java.util.Scanner;

public class Find_unique {
    static int Find_Unique(int[] arr)
    {
        while (arr.length%2!=0) {
            int ans = 0;
            for (int j : arr) {
                ans = ans ^ j;
            }
            return ans;
        }
        return 0;
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


        System.out.println(Find_Unique(arr));
    }
}
