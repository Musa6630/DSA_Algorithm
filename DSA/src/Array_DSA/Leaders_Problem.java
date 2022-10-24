package Array_DSA;

public class Leaders_Problem {
    static void Leaders_Problem(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            boolean flag=false;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]<=arr[j])
                {
                    flag=true;
                    break;
                }
            }
            if (!flag)
            {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={2,3,5,4,10,12,1,8};
        Leaders_Problem(arr);
    }
}
