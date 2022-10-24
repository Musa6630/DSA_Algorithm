package Array_DSA;

public class Frequencies_OF_Number {
    static void Print_Freq(int[] arr){
        int n= arr.length;
        int freq=1,i=1;
        while (i<n)
        {
            while (i<n && arr[i]==arr[i-1])
            {
                freq++;
                i++;
            }
            System.out.println(arr[i-1]+" "+freq);
            i++;
            freq=1;
        }
        if (n==1 || arr[n-1]!=arr[n-2])
        {
            System.out.println(arr[n-1]+" "+1);
        }
    }

    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,2,3,4,4,4,4,4,4};
        Print_Freq(arr);
    }
}
