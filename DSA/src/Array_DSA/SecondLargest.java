package Array_DSA;
import java.util.Scanner;
public class SecondLargest {
    static int getSecondlargest(int n, int[] arr)
    {
        int largest=getLargest(n,arr);
        int res=-1;
        for (int i = 0; i < n; i++) {
            if (arr[i]!=arr[largest])
            {
                if (res==-1)
                    res=i;
                else if (arr[i]>arr[res])
                    res=i;
            }
        }
        return res;
    }
    static int getLargest(int n, int[] arr)
    {
        int largest=0;
        for (int i = 1; i < n; i++)
            if (arr[i]>arr[largest]) {
                largest = i;
            }
        return largest;

    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter The size of an array: ");
        int n=input.nextInt();
        System.out.println("Enter the elements in array: ");
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextInt();
        }
        getSecondlargest(n,arr);
    }
}
