package Array_DSA;

import java.util.Arrays;

public class TripletSum_BruteForce {
    static Object[] Triplet(int[] arr , int s)
    {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i]+arr[j]+arr[k]==s)
                    {
                        System.out.println(arr[i]+","+arr[j]+","+arr[k]);
                    }
                }
            }
        }
        return new Object[0];
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,12,32,12,32,43,21,23,2,3,7,8,9,10};
        int s=10;
        System.out.println(Arrays.toString(Triplet(arr, s)));

    }
}
