package Array_GFG_Question;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrange {
    public static void arrange(long arr[], int n)
    {
        // your code here
        long[] temp = (long[]) arr.clone();
        for(int i=0;i<n;i++)
        {
            arr[i]=temp[(int)temp[i]];
        }
        System.out.println(Arrays.toString(temp));
    }

    public static void main(String[] args) {
        long[] arr={1,0};
        int n= arr.length;
        arrange(arr,n);
    }
}
