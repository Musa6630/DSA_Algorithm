package Array_DSA;

import java.util.ArrayList;

public class Intersection_SortedArray {
    static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        while(i<n && j<m){
            if(arr1.get(i) < arr2.get(j)){
                i++;
            }else if(arr1.get(i).equals(arr2.get(j))){
                list.add(arr1.get(i));
                i++;
                j++;
            }else{
                j++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1=new ArrayList<>();
        int m=4;
        ArrayList<Integer> arr2=new ArrayList<>();
        int n=4;
        arr1.add(2);
        arr1.add(3);
        arr1.add(5);
        arr1.add(6);

        arr2.add(2);
        arr2.add(5);
        arr2.add(9);
        arr2.add(10);
        System.out.println(findArrayIntersection(arr1,n,arr2,m));
    }
}
