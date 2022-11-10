package fraz_questions;

import java.util.Arrays;

public class moveZeroes {
    public static void moveZeroes(int[] nums) {
        int j=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0)
            {
                nums[j]=nums[i];
                j++;
            }
        }
        while (j<nums.length)
        {
            nums[j]=0;
            j++;
        }
        System.out.println(Arrays.toString(nums));

    }

    public static void main(String[] args) {
        int[] num={0,1,2,0,9,0,0,22,0,98,99};
        moveZeroes(num);
    }
}
