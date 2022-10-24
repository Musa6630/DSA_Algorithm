package Array_DSA;

import java.util.Arrays;

public class SmallerNumbertthancurrent {
    static int[] smallestnumber(int[] nums)
    {
        int[] answer = new int[nums.length];
        int count;
        for(int i=0; i<nums.length; i++) {
            count = 0;
            for(int j=0; j<nums.length; j++) {
                if(i!=j && nums[j] < nums[i])
                    count++;
            }
            answer[i] = count;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums={9,2,3,4,5,6};
        System.out.println(Arrays.toString(smallestnumber(nums)));
    }
}
