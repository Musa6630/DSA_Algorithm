package Linear_Search;

public class Search_In_Range {
    static int SearchInRange(int[] arr, int start,int end,int element)
    {
        if (arr.length==0)
        {
            return -1;
        }
        for (int i = start; i <=end ; i++) {
            if (arr[i]==element)
            {
                System.out.println("Element found at "+ i);
                //return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,12,13,7};
        SearchInRange(arr,2,6,12);
    }
}
