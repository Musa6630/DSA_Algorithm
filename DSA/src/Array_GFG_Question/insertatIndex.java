package Array_GFG_Question;

import java.util.Arrays;

public class insertatIndex {
    public static void insertatIndex(int[] arr, int pos,int element)
    {
        int n= arr.length+1;
        for (int i = n-1; i >pos; i--) {
            arr[i-1]=arr[i];
        }
        arr[pos]=element;
    }

    public static void main(String[] args) {
        int n=3;
        int[] arr=new int[n+1];

        insertatIndex(arr,1,23);
    }
}
