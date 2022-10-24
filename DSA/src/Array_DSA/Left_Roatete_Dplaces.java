package Array_DSA;
//Naive Approach
public class Left_Roatete_Dplaces {
    static void lRotateOne(int[] arr, int n)
    {
        int temp = arr[0];
        for(int i = 1; i < n; i++)
        {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
    }
    static void leftRotate(int[] arr, int d, int n)
    {
        for(int i = 0; i < d; i++)
        {
            lRotateOne(arr, n);
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n= arr.length;
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
        leftRotate(arr,1,5);
        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println();
        leftRotate(arr,1,5);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
