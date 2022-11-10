package DSA_LOVE_BABBAR_450;

public class maxnmin {
    public static int findSum(int[] A, int N)
    {
        //code here
        N=A.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        //int sum=min+max;
        for (int k : A) {
            if (k > max) {
                max = k;
            }
        }
        for (int j : A) {
            if (j < min) {
                min = j;
            }
        }
        System.out.println(max);
        System.out.println(min);
        return min+max;
    }

    public static void main(String[] args) {
        int[] A={-2 ,1 ,-4 ,5 ,3};
        int N=A.length;
        System.out.println(findSum(A,N));
    }
}
