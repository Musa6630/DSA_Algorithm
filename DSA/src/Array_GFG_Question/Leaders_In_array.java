package Array_GFG_Question;

import java.util.ArrayList;
import java.util.Collections;

public class Leaders_In_array {
    static ArrayList<Integer> leaders(int[] arr, int n){
        // Your code here
        n = arr.length;
        ArrayList<Integer> a=new ArrayList<>();
        int max=0;
        for (int i = arr.length-1; i>=0 ; i--) {
            if (arr[i]>=max)
            {
                max=arr[i];
                a.add(arr[i]);
            }
        }
        Collections.reverse(a);
        return a;

    }

    public static void main(String[] args) {
        int [] arr={21,16,17,4,3,5,2};
        int n= arr.length;
        System.out.println(leaders(arr,n));
    }
}
