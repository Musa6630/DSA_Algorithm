package Array_DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairSum {
    public static int[][] pairSum(int[] arr, int s) {
        List<List<Integer>> li = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == s) {
                    List<Integer> a = new ArrayList<>();
                    a.add(arr[i]);
                    a.add(arr[j]);
                    li.add(a);
                }
            }

        }

        int[][] ans = new int[li.size()][2];
        for (int i = 0; i < li.size(); i++) {
            for (int j = 0; j < 2; j++) {
                ans[i][j] = li.get(i).get(j);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={2,3,1,24,12,43,4,5,23,323,1,13};
        int s=25;
        System.out.println(Arrays.deepToString(pairSum(arr, s)));
    }
}
