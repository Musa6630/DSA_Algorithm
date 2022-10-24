package Array_DSA;

public class Left_Rotate_One {
    static void leftrotate(int[] arr)
    {
        int temp=arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        System.out.println("Before Rotation");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        leftrotate(arr);
        System.out.println("After Rotation");

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
