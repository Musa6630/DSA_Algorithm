package Array_DSA;

import java.util.Arrays;

public class Sort_012 {
    public static Object[] sort012(int[] arr)
    {
        //Write your code here
        int count0 = 0, count1 = 0, count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {count0++;}
            if (arr[i] == 1) {count1++;}
            if (arr[i] == 2) {count2++;}
        }
        for(int i = 0; i < arr.length; i++) {
            if (i < count0) {arr[i] = 0;}
            else if (i < count0 + count1) {arr[i] = 1;}
            else {arr[i] = 2;}
            System.out.print(arr[i]+" ");
        }

        return new Object[0];
    }

    public static void main(String[] args) {
        int[] arr={2,1,2,1,0,2,1,2,0,1,0,2,1,2,1,1,2};
        System.out.println(Arrays.toString(sort012(arr)));
    }
}
