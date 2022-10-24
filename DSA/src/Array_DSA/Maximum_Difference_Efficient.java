package Array_DSA;

public class Maximum_Difference_Efficient {
    static int Max_Diff(int[] arr)
    {
        int res=arr[1]-arr[0],min_val=arr[0];
        for (int i = 1; i < arr.length; i++) {
            res=Math.max(res,arr[i]-min_val);
            min_val=Math.min(min_val,arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr={2,3,1,4,1,5,6,32,9};
        System.out.println(Max_Diff(arr));
    }
}
