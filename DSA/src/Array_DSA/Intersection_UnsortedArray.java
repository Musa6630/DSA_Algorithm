package Array_DSA;

import java.util.Arrays;
import java.util.HashSet;

public class Intersection_UnsortedArray {
    static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersect = new HashSet<>();
        for (Integer i : nums1) {
            set.add(i);
        }
        for (Integer i : nums2) {
            if (set.contains(i)) {
                intersect.add(i);
            }
        }
        int[] result = new int[intersect.size()];
        int i = 0;
        for (Integer num : intersect) {
            result[i++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1={45,2,1,3,4,5,6,1,23,4,67};
        int[] nums2={3,45,2,4,1,3,5,6,43,5,3,67};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
}
