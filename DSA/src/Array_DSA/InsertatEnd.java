package Array_DSA;

import java.util.Arrays;

public class InsertatEnd {
    public static void insertatend(int[] arr, int n, int element)
    {
        arr[n]=element;
        for (int i = 0; i < n+1 ; i++) {
            arr[n]=element;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        insertatend(arr,4,12);

    }
}