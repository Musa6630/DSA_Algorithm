package Binary_Search;

public class Peak_Index_Mountain_Array_852 {
    public static int peakIndex(int[] arr)
    {
        int max=Integer.MIN_VALUE;
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max)
            {
                max=arr[i];
                ans=i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,4,3,2,1};
        System.out.println(peakIndex(arr));
    }
}
