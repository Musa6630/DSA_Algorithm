package Array_GFG_Question;

import java.util.Arrays;

public class medianofArray {
    public static int meadianArray(int[] A,int N)
    {
        N=A.length;
        Arrays.sort(A);
        int ans=0;
        if(N%2==1)
            ans=A[N/2];
        else
            ans=(A[N/2]+A[(N/2)-1])/2;

        return ans;
    }

    public static void main(String[] args) {
        int[] A={2, 8, 3, 4};
        int N= A.length;
        System.out.println(meadianArray(A,N));
    }

}
//2 8 3 4
//4 3