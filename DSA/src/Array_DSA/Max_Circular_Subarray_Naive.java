package Array_DSA;

public class Max_Circular_Subarray_Naive {
    public static int MaxCircularsum(int[] arr){
        int n= arr.length;
        int res=arr[0];
        for (int i = 0; i < n; i++) {
            int curr_max=arr[i];
            int curr_sum=arr[i];
            for (int j = 1; j < n; j++) {
                int index=(i+j)%n;
                curr_sum=curr_sum+arr[index];
                curr_max=Math.max(curr_sum,curr_max);
            }
            res=Math.max(res,curr_max);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr={-1,-6,2,1,3,-8,7};
        System.out.println(MaxCircularsum(arr));
    }
}
