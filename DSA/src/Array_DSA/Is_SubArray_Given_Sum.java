package Array_DSA;
public class Is_SubArray_Given_Sum {
    public static boolean ISGivensum(int[] arr,int sum) {
        int n = arr.length;
        int s = 0, curr = 0;
        for (int e = 0; e < n; e++)
        {
            curr = curr + arr[e];

            while (sum < curr)
            {
                curr = curr - arr[s];
                s++;
            }
            if (curr == sum)
                return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        int[] arr={1,2,1,2,3,12};
        System.out.println(ISGivensum(arr,27));
    }
}
