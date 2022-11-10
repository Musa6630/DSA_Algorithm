package Array_DSA;

public class Equilibrium_Point_Efficient {
    public static int Epoint(int[] arr)
    {
        int rs=0;
        for (int j : arr) {
            rs = rs + j;
        }
        int ls=0;
        for (int i = 0; i < arr.length; i++) {
            rs=rs-arr[i];
            if (ls==rs)
                return i;
            ls=ls+arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,1,2,3,4};
        System.out.println(Epoint(arr));
    }
}
