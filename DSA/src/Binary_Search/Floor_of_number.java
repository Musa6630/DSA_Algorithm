package Binary_Search;

public class Floor_of_number {
    public static int Floor_of_number(int[] arr, int target)
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
        System.out.println("Floor of "+ target +" is "+arr[end]);
        return end;
    }

    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8,9,11,12,13,14,15};
        int target=10;
        System.out.println(Floor_of_number(arr,target));
    }

}
