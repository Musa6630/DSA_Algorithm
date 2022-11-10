package Binary_Search;

public class Binary_search1 {
    public static int Binary_search(int[] arr,int target)
    {
        int middle=arr.length/2;
        if (target==arr[middle])
        {
            return middle;
        }
        if (target>arr[middle])
        {
            for (int i = middle; i < arr.length; i++) {
                if (arr[i]==target)
                {
                    return i;
                }
            }
        }
        if (target<arr[middle])
        {
            for (int i=middle;i>=0;i--)
            {
                if (arr[i]==target)
                {
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10,12,14,16,18};
        System.out.println(Binary_search(arr,10));

    }
}
