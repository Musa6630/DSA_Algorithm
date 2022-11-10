package Linear_Search;

public class Simple_Search {
    static int Simple_Search(int[] arr,int element)
    {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==element)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(Simple_Search(arr,4));
    }
}
