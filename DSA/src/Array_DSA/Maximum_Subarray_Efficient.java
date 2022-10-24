package Array_DSA;

public class Maximum_Subarray_Efficient {
    static public int maxSubArray(int[] nums) {
        int n=nums.length;
        int res=nums[0];
        int maxEnding=nums[0];
        for(int i=1;i<n;i++)
        {
            maxEnding=Math.max(maxEnding+nums[i],nums[i]);
            res=Math.max(maxEnding,res);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,-8,9,9,-7};
        System.out.println(maxSubArray(nums));
    }
}
