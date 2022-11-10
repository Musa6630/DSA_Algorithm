package Linear_Search;

public class Find_Min {
    static int min(int[] arr)
    {
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr={21,23,12,9};
        System.out.println(min(arr));
    }
}
