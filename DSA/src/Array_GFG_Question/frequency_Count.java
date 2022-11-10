package Array_GFG_Question;

import java.util.Arrays;

public class frequency_Count {
    public static int[] frequenciescount(int[] arr , int P)
    {
        int N= arr.length;
        int maxi = Math.max(P,N);
        int[] count = new int[maxi+1];
        Arrays.fill(count, 0);
        for(int i=0;i<N;i++){
            count[arr[i]]++;
        }

        for(int i=0;i<N;i++){
            arr[i] = count[i+1];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={1,2,2,2};
        System.out.println(Arrays.toString(frequenciescount(arr, 4)));
    }
}
