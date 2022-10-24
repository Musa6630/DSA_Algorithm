package Array_DSA;

public class MaxConsecutive_Ones_Naive {
    static int Maxconsecutive_Ones(int[] arr)
    {
        int res=0;
        for (int i = 0; i < arr.length; i++) {
            int cur=0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j]==1)
                    cur++;
                else break;
            }
            res=Math.max(res,cur);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr={2,1,2,3,4,1,2,3,1,1,1,1,3,21,1,1};
        System.out.println(Maxconsecutive_Ones(arr));
    }
}
