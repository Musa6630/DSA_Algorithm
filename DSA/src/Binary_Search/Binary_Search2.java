package Binary_Search;

public class Binary_Search2 {
    public static int Binary_search(int[] arr, int target)
    {
        int start=0;
        int end=arr.length-1;
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if (target<arr[mid])
            {
                end=mid-1;
            }
            else if (target>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int target=10;
        System.out.println(Binary_search(arr,target));
    }
}
