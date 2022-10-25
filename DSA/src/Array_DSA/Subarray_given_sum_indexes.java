package Array_DSA;

public class Subarray_given_sum_indexes {
    public static boolean isSubarray(int[] arr,int sum)
    {

        for (int i = 0; i < arr.length; i++) {
            int curr_sum=0;
            for (int j = i; j < arr.length; j++) {
                curr_sum=curr_sum+arr[i];
                if (curr_sum==sum) {
                    return true;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[] arr={1,2,1,2,1};
        int sum=10;
        System.out.println(isSubarray(arr,sum));
    }
}
