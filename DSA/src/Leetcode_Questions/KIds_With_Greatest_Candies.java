package Leetcode_Questions;

import java.util.ArrayList;
import java.util.List;

public class KIds_With_Greatest_Candies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = -1;
        for (int candy : candies) {
            max = Math.max(candy, max);
        }
        List<Boolean> A=new ArrayList<>();
        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                A.add(true);
            } else
                A.add(false);
        }

        return A;
    }

    public static void main(String[] args) {
        int[] candies={2,3,5,1,3};
        System.out.println(kidsWithCandies(candies,3));
    }
}
