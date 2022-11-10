package Array_GFG_Question;

import java.util.Arrays;

public class convert_To_Wave {
    public static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // This function sorts arr[0..n-1] in wave form, i.e.,
    // arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4]..
    public static int[] sortInWave(int[] arr, int n)
    {
        // Sort the input array
        Arrays.sort(arr);

        // Swap adjacent elements
        for (int i=0; i<n-1; i =i+ 2)
            swap(arr, i, i+1);

        return arr;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int n=arr.length;
        System.out.println(Arrays.toString(sortInWave(arr, n)));
    }

}
