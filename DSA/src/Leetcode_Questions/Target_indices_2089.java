package Leetcode_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Target_indices_2089 {
    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> indices=new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target)
            {
                indices.add(i);
            }
        }
        return indices;
    }

    public static void main(String[] args) {
        int[] nums={1,2,5,2,3};
        System.out.println(targetIndices(nums,2));
    }
}
