package Array_GFG_Question;

public class majorityWins {
    public static int majorityWins(int[] arr,int X,int Y)
    {
        int CountX=0;
        int CountY=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==X)
            {
                CountX++;
            }
            else if (arr[i]==Y)
            {
                CountY++;
            }
        }
        if (CountX>CountY)
        {
            return X;
        }
        else if (CountY>CountX)
        {
            return Y;
        }
        while(CountX==CountY)
            return Math.min(X,Y);

        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,4,5,6};
        System.out.println(majorityWins(arr,6,5));
    }

}
