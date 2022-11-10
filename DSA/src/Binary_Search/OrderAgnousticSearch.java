package Binary_Search;

public class OrderAgnousticSearch {
    public static int Order_Not_Known_Search(int[] arr, int target)
    {
        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[start]<arr[end];
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if (target==arr[mid])
            {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={100,90,80,70,60,50,40,30,20,10,9,8,7,6,5,4,3,2,1,-1,-4,-21,-98,-987};
        int target=-21;
        int ans=Order_Not_Known_Search(arr,target);
        System.out.println(ans);
    }
}
