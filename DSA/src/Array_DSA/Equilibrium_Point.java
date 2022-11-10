package Array_DSA;

public class Equilibrium_Point {
    public static int ePoint(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            int ls=0,rs=0;
            for (int j = 0; j < i; j++) {
                ls=ls+arr[j];
            }
            for (int k = i+1; k < arr.length; k++) {
                rs=rs+arr[k];
            }

            if (ls==rs)
                return i;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,1,2,3};
        System.out.println(ePoint(arr));
    }
}
