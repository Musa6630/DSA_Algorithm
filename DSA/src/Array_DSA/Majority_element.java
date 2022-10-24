package Array_DSA;

public class Majority_element {
    public static int findMajority(int[] arr, int n)
    {
        for(int i = 0; i < n; i++)
        {
            int count = 1;

            for(int j = i + 1; j < n; j++)
            {
                if(arr[i] == arr[j])
                    count++;
            }

            if(count > n / 2)
                return arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,1,1,2,3,3,3,3,3,3};
        System.out.println(findMajority(arr,arr.length));

    }
}
