package fraz_questions;

public class majority_elements {
    public static int majorityelements(int[] nums)
    {
        int candidate=0;
        int vote=1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]==candidate)
            {
                vote++;
            }
            else
            {
                vote--;
            }
            if (vote==0)
            {
                candidate=i;
                vote++;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] nums={1,1,2,1,7,1};
        System.out.println(majorityelements(nums));
    }
}
