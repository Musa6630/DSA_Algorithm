package Array_DSA;
/*

    Time Complexity: O(N^2)
    Space Complexity: O(1)

    Where N is the number of elements in the array.

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TripletSum_Optimised {
    static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int k) {
        ArrayList <ArrayList<Integer>> ans = new ArrayList<>();
        // Sorting the arraylist.
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            int target = k-arr[i];
            int front = i + 1;
            int back = n - 1;

            while (front < back) {
                int sum = arr[front] + arr[back];

                // Finding answer which starts from arr[i].
                if (sum < target) {
                    front++;
                }
                else if (sum > target) {
                    back--;
                }
                else {
                    int x = arr[front];
                    int y = arr[back];

                    ArrayList<Integer> list = new ArrayList<>();

                    list.add(arr[i]);
                    list.add(arr[front]);
                    list.add(arr[back]);
                    ans.add(list);

                    // Incrementing front pointer until we reach a different number.
                    while (front < back && arr[front] == x) {
                        front++;
                    }

                    // Decrementing last pointer until we reach a different number.
                    while (front < back && arr[back] == y) {
                        back--;
                    }
                }
            }
            // Ensuring that we don't encounter duplicate values for arr[i].
            while (i + 1 < n && arr[i] == arr[i + 1]) {
                i++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,42,21,3,4,3,5,45,33,2,4,22,4,5,43,32,5,3,3,58,2,1,54,4,2,4,10};
        int n= arr.length;
        int k=24;
        System.out.println(findTriplets(arr,n,k));
    }

}
