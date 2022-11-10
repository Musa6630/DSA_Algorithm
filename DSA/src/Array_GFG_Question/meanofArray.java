package Array_GFG_Question;

public class meanofArray {
    public static int mean(int[] arr)
    {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        return sum/arr.length;
    }

    public static void main(String[] args) {
        int[] arr={1, 2, 19, 28, 5};
        System.out.println(mean(arr));
    }
}
