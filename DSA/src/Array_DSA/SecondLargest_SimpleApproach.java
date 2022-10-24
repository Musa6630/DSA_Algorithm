package Array_DSA;
import java.util.Arrays;
import java.util.Scanner;
public class SecondLargest_SimpleApproach {
        static void print2largest(int[] arr, int arr_size)
        {
            int i, first, second;
            //There should be at least two elements
            if (arr_size < 2)
            {
                System.out.print(" Invalid Input ");
                return;
            }
            Arrays.sort(arr);
            for (i = arr_size - 2; i >= 0; i--)
            {
                // If the element is not equal to the largest element
                if (arr[i] != arr[arr_size - 1])
                {
                    System.out.printf("The second largest " + "element is %d\n", arr[i]);
                    return;
                }
            }
            System.out.print("There is no second " + "largest element\n");
        }
        public static void main(String[] args)
        {
            int[] arr = {12, 35, 1, 10, 34, 1,36,54,34,23,12,32,12,345,343,5,5,3,2,4,5,443,325,};
            int n = arr.length;
            print2largest(arr, n);
        }
        /*
        Time Complexity: O(n log n).
        Time required to sort the array is O(n log n).
        Auxiliary space: O(1).
        As no extra space is required.
         */
    }


