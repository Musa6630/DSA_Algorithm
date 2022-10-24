package Array_DSA;

import java.util.Arrays;

public class Zeros_To_End {
    static void zerotoend(int[] arr)
    {
        Arrays.sort(arr);
        int n= arr.length;
        int count = 0;
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i];

        while (count < n)
            arr[count++] = 0;
    }

    public static void main(String[] args) {
        int[] arr={2,0,5,0,0,9,0,5,4,3,0,0,30,40,0};
        System.out.println("Before Pushing: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println(" ");

        zerotoend(arr);
        System.out.println("After Pushing: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

}
