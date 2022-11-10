package Array_GFG_Question;

public class min_difference {
    public static int minAdjDiff(int[] arr, int n){
        //Storing the difference of first and second element in the array.
        int res = Math.abs(arr[0]-arr[1]);
        //Iterating from the 2nd index to the last index.
        for(int i = 2; i < n; i++)
        {
            //Updating the minimum value whenever we get a smaller adjacent
            //difference than previously stored value.
            res = Math.min(res, Math.abs(arr[i]-arr[i-1])); //finding min
        }
        //Finally checking the difference between last and first element
        //as it's a circular array.
        res = Math.min(res, Math.abs(arr[0]-arr[n-1]));

        //returning the final answer.
        return res;
    }

    public static void main(String[] args) {
        int[] arr={8,-8,9,-9,10,-11,12};
        int n= arr.length;
        System.out.println(minAdjDiff(arr,n));
    }
}
