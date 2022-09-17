package Array_DSA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Find_Duplicates {
    static List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++)
        {
            int n = Math.abs(nums[i])-1;
            if(nums[n] < 0) {
                duplicates.add(n+1);
            }
            else
            {
                nums[n] = -nums[n];
            }
        }
        return duplicates;
    }
    public static void main(String[] args) {
        System.out.println("Enter the Size of Array: ");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();

        int [] nums=new int[n];
        System.out.println("Enter the elements in array: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i]=input.nextInt();
        }

        //int[] arr={9,46,54,46,57};

        System.out.println();
    }
}
