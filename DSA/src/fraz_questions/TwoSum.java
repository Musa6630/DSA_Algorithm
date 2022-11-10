package fraz_questions;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i]+nums[j]) {
                    return new int[] { i, j };
                }
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }
    //You may assume that each input would have exactly one solution, and you may not use the same element twice.

    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=17;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
