package Array_GFG_Question;

public class EPoint {
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        long sum = 0;
        for (int i = 0; i < n; i++)
            sum += arr[i];

        //sum2 is used to store prefix sum.
        long sum2 = 0;
        int ans = -1;

        for (int i = 0; i < n; i++) {

            //Leaving out the value of current element from suffix sum.
            sum = sum - arr[i];

            //Checking if suffix and prefix sums are same.
            if (sum2 == sum) {
                //returning the index or equilibrium point.
                return (i+1);
            }

            //Adding the value of current element to prefix sum.
            sum2 = sum2 + arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        long[] arr={1,2,3,4,1,2,3};
        System.out.println(equilibriumPoint(arr,7));
    }
}
