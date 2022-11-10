package Linear_Search;

public class Richesh_Customer_1672 {
    static int richest(int[][] arr)
    {
        int ans=Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            int total=0;
            for (int col = 0; col < arr[row].length; col++) {
                total=total+arr[row][col];
            }
            ans=Math.max(ans,total);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] arr={
                {2,8,7},
                {7,1,3},
                {1,9,5}
        };
        System.out.println(richest(arr));
    }
}
