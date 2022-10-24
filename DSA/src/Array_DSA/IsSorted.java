package Array_DSA;

public class IsSorted {
    static boolean isSorted(int[] arr,int n)
    {
        for (int i = 1; i < n; i++) {
            if (arr[i]<arr[i-1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr={2 ,3 , 4 , 5};
        System.out.println(isSorted(arr, arr.length));
    }
}
