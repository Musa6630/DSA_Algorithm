package Array_GFG_Question;

public class maxIndexDiff {
    public static int maxIndexDiff(int[] A, int N)
    {
        int maxxdiff;
        N=A.length;
        int i,j;
        int[] lmin=new int[N];
        int[] rmax=new int[N];

        lmin[0]=A[0];
        for (i = 1; i < N; i++) {
            lmin[i]=Math.min(A[i], lmin[i-1]);
        }
        
        rmax[N-1]=A[N-1];
        for (j = N-2;j>=0; j--) {
            rmax[j]=Math.max(A[j],rmax[j+1]);
        }

        i=0;
        j=0;
        maxxdiff=-1;
        while (j<N && i<N)
        {
           if (lmin[i]<=rmax[j])
           {
               maxxdiff=Math.max(maxxdiff,j-i);
               j=j+1;
           }
           else
               i=i+1;
        }
        return maxxdiff;
    }

    public static void main(String[] args) {
        int[] A={34, 8, 10, 3, 2, 80, 30, 33, 1};
        int n=A.length;
        System.out.println(maxIndexDiff(A,n));
    }
}
