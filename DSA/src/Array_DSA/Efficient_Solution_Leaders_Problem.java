package Array_DSA;

import java.util.Arrays;

public class Efficient_Solution_Leaders_Problem {
    static void Leaders(int[] arr)
    {
        int curr_Leader=arr[arr.length-1];
        System.out.print(curr_Leader+" ");
        for (int i = arr.length-2; i >=0 ; i--) {
            if (curr_Leader<arr[i])
            {
                curr_Leader=arr[i];
                System.out.print(curr_Leader+" ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={2,3,15,1,7,10,8,7,6,12};
        Leaders(arr);
    }
}
