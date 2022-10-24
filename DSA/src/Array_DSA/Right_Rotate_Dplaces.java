package Array_DSA;
//Naive Approach
public class Right_Rotate_Dplaces {
    static void RightRotate(int[] arr)
    {
        int i, temp;
        temp = arr[arr.length - 1];
        for (i = arr.length-1; i > 0; i--)
            arr[i] = arr[i - 1];     // Right shift by one
        arr[0] = temp;
    }
    static void RightRotateD(int[] arr, int d, int n)
    {
        for(int i = 0; i < d; i++)
        {
            RightRotate(arr);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Before Rotation");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        RightRotateD(arr,2,5);
        System.out.println("After Rotation");

        for (int j : arr) {
            System.out.print(j + " ");
        }

    }
}
