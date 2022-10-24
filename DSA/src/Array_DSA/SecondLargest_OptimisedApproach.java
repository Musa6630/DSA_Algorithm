package Array_DSA;
import java.util.Arrays;

public class SecondLargest_OptimisedApproach {
    static void print2largest(int[] arr, int arr_size)
    {
        int i, first, second;

        // There should be atleast two elements
        if (arr_size < 2)
        {
            System.out.printf(" Invalid Input ");
            return;
        }

        int largest = second = Integer.MIN_VALUE;

        // Find the largest element
        for(i = 0; i < arr_size; i++)
        {
            largest = Math.max(largest, arr[i]);
        }

        // Find the second largest element
        for(i = 0; i < arr_size; i++)
        {
            if (arr[i] != largest)
                second = Math.max(second, arr[i]);
        }
        if (second == Integer.MIN_VALUE)
            System.out.printf("There is no second " +
                    "largest element\n");
        else
            System.out.printf("The second largest " +
                    "element is %d\n", second);
    }

    public static void main(String[] args)
    {
        int[] arr = { 12, 35, 1, 10, 34, 1 ,45,67,87,76,123,453,65,78,98,909,123,342,987,675,45,908};
        int n = arr.length;

        print2largest(arr, n);
        /*
            Time Complexity: O(n).
                Two traversal of the array is needed.
            Auxiliary space: O(1).
                As no extra space is required.
         */
    }
    }
