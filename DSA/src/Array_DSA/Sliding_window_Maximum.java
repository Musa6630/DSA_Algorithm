package Array_DSA;

public class Sliding_window_Maximum {
    static int maxSum(int arr[], int k)
    {
        int curr_sum = 0;

        for(int i = 0; i < k; i++) {
            curr_sum += arr[i];
        }

        int max_sum = curr_sum;

        for(int i = k; i < arr.length; i++)
        {
            curr_sum += (arr[i] - arr[i - k]);

            max_sum = Math.max(max_sum, curr_sum);
        }

        return max_sum;
    }

    public static void main(String[] args) {
        int[] arr={2,8,6,5,3,4,15,6};
        int k=3;
        System.out.println(maxSum(arr,3));

    }
}
