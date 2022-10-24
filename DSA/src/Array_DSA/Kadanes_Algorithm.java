package Array_DSA;

public class Kadanes_Algorithm {
    static public int maxSubArray(int[] nums) {
        int sum=0;
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums={-1,-2};
        System.out.println(maxSubArray(nums));
    }
}
