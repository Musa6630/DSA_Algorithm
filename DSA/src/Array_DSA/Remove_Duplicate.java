package Array_DSA;

public class Remove_Duplicate {
    static int remove_duplicate(int[] arr) {
        int res = 1;

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[res - 1] != arr[i])
            {
                arr[res] = arr[i];
                res++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr={2,2,3,3,4,5,5};
        System.out.println("Before Removing Duplicates");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");

        int n=remove_duplicate(arr);
        System.out.println("After removing Duplicates: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
