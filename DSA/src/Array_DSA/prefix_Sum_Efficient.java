package Array_DSA;

public class prefix_Sum_Efficient {
    public static void main(String[] args)
    {

        int[] arr={1,2,3,4,5,8};
        int n=6;
        int[] pr=new int[n];
        pr[0]=arr[0];
        for (int i = 1; i < n; i++) {
            pr[i]=pr[i-1]+arr[i];
        }
    }
}
