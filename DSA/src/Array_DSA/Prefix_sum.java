package Array_DSA;

public class Prefix_sum {
    public static int getsum(int[] arr,int start,int end)
    {
        int sum=0;
        for (int i = start; i < end; i++) {
            sum=sum+arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(getsum(arr,1,4));
    }
}
