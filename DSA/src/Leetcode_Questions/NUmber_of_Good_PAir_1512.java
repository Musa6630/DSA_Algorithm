package Leetcode_Questions;

public class NUmber_of_Good_PAir_1512 {
    public static int Good_Pair(int[] arr)
    {
//        int count=0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[i]==arr[j] && i<j)
//                {
//                    count++;
//                }
//            }
//        }
//        return count;
        int ans = 0;
        int[] count = new int[101];

        for(int n: arr) {
            count[n]++;
        }

        for(int n: count) {
            ans =ans+ (n * (n - 1)) / 2;
        }
        return ans;


    }

    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,3};
        System.out.println(Good_Pair(arr));
    }
}
