package Array_DSA;

public class canThreePartsEqualSum {
    public static boolean canThreePartsEqualSum(int[] A) {
        int sum=0;
        for(int i: A)
            sum=sum+i;
        if(sum%3!=0)
            return false;
        int each=sum/3,temp=0,found=0;
        for (int i=0; i<A.length; i++) {
            temp=temp+A[i];
            if(temp==each){
                temp = 0;
                found++;
            }
        }
        if(found>=3)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int[] A={1,2,3,1,2,3,1,2,3,1,2,3};
        System.out.println(canThreePartsEqualSum(A));
    }
}
