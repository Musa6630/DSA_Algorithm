package Array_GFG_Question;
import java.util.ArrayList;
public class ReverseArrayinSubgroups {
    public static void reverse(ArrayList<Integer> arr, int n,int left, int right)
    {
        while (left < right)
        {
            int temp = arr.get(left);
            arr.set(left, arr.get(right));
            arr.set(right, temp);
            left+=1;
            right-=1;
        }
    }
    public static ArrayList<Integer> reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        for (int i = 0; i < n; i += k) {
            if(i+k < n){
                reverse(arr,n,i,i+k-1);
            }
//            else{
//                reverse(arr,n,i,n-1);
//            }
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(12);
        arr.add(981);
        arr.add(421);
        arr.add(321);
        arr.add(1);
        int n=arr.size();
        System.out.println(reverseInGroups(arr,n,3));
    }
}
