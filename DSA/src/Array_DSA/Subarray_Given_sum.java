package Array_DSA;

import java.util.HashMap;

public class Subarray_Given_sum {
    public int SubArraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap< Integer, Integer > map = new HashMap < > ();
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (sum == k)
            {
                count++;
            }
            if (map.containsKey(sum - k))
                count =count+ map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr={1,2,1,2,1};

    }
}
