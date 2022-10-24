package Array_DSA;

public class Maximum_Difference {
    static int Max_Difference(int[] arr)
    {
        int res=arr[1]-arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                res=Math.max(res,arr[j]-arr[i]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr={13,24,5,6,10,3,7,5,12};
        System.out.println(Max_Difference(arr));
    }
}
