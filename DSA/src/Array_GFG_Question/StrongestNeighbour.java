package Array_GFG_Question;

public class StrongestNeighbour {
    public static void maximumAdjacent(int[] arr)
    {
        //int max=0;
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println(Math.max(arr[i],arr[i+1]));
        }
    }

    public static void main(String[] args) {
        int[] arr= {1,2,2,3,4,5};
        maximumAdjacent(arr);
    }
}
