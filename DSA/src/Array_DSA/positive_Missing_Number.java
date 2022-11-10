package Array_DSA;

import java.util.Arrays;
import java.util.Collections;

public class positive_Missing_Number {
    public static int MissingPositiveNumber(int[] arr,int n)
    {
        n= arr.length;
        int min=1;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (arr[i]==min)
            {
                min++;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr={1,2,4,3,5};
        int n= arr.length;
        System.out.println(MissingPositiveNumber(arr,n));
    }
}
