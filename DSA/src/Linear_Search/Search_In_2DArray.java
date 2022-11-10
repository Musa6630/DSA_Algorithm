package Linear_Search;

import java.util.Arrays;

public class Search_In_2DArray {
    static int[] Search2D(int[][] arr,int elements)
    {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]==elements)
                    return new int[]{row,col};
            }
        }
        return new int[]{-1,-1};
    }
    static int max(int[][] arr)
    {
        int max=Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]>max)
                {
                    max=arr[row][col];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4},
                {12,132,14,15},
                {4,1,6,8,11}
        };
        System.out.println(Arrays.toString(Search2D(arr, 123)));
        System.out.println(max(arr));
    }
}
