package DSA_LOVE_BABBAR_450;

import java.util.Arrays;

public class kthSmallest {
    public static int kthSmallest_Number(int[] arr, int l, int r)
    {
        int smaller_no=1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<arr.length)
            {
                smaller_no=arr[i];
            }
        }
        Arrays.sort(arr);
        return arr[smaller_no-1];
    }

    public static void main(String[] args) {
        int[] arr={7 ,10 ,4 ,3 ,20 ,15};
        System.out.println(kthSmallest_Number(arr,0,arr.length));
    }
}
