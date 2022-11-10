package fraz_questions;

public class Pivot_index {
    public static int pivotIndex(int[] nums) {
        int rs=0;
        for(int i=0; i<nums.length; i++)
        {
            rs=rs+nums[i];
        }
        int ls=0;
        for(int i=0; i<nums.length; i++)
        {
            rs=rs-nums[i];
            if(ls==rs) {
                System.out.println("The sum that is on both side Exempting Pivot is "+ls);
                return i;
            }
            ls=ls+nums[i];

        }
        //System.out.println(ls);

        return -1;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,1,2,4};
        System.out.println(pivotIndex(nums));

    }
}
