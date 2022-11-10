package fraz_questions;

public class Moores_Voting_Algo_MAjority_Elements {
        public static int Moores_Voting(int[] nums)
        {
                int candidate=0;
                int count=0;
                for (int i = 0; i < nums.length; i++) {
                        if (count==0)
                        {
                                candidate=nums[i];
                        }
                        if (candidate==nums[i])
                        {
                                count++;
                        }
                        else
                                count--;
                }
                return candidate;
        }

        public static void main(String[] args) {
                int[] nums={121,121,231,121,121,878,121};
                System.out.println(Moores_Voting(nums));
        }
        }
