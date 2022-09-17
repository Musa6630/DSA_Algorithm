package Array_DSA;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Unique_No_occurances {
    static boolean unique_occurance(int[] arr)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i:arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        HashSet<Integer> set=new HashSet<>();
        for (int i: map.values())
        {
            if (!set.contains(i))
                set.add(i);
            else
                return false;
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter The size of an array: ");
        int n=input.nextInt();
        System.out.println("Enter the elements in array: ");
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextInt();
        }

        System.out.println(unique_occurance(arr));
    }
}
