package Array_DSA;

public class Max_Range {
    static int Max(int[] arr)
    {
        int max_val=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max_val)
            {
                max_val=arr[i];
            }
        }
        return max_val;
    }
    static int Max_Range(int[] arr,int start,int end)
    {
        int max=arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int[] arr={12,21,32,1,2,3,38,12};
        int[] arr2={9,8,7,6,5,4,3,2,1,2,3,4,5,6,7,8,9};
        System.out.println(Max_Range(arr,2,6));
        System.out.println(Max(arr2));
    }
}
