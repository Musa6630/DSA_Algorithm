package Array_GFG_Question;

import java.util.ArrayList;

public class largestAndSecondLargest {
    public static int largestAndSecondLargest(int[] arr)
    {
        ArrayList<Integer> list=new ArrayList<>();
        int secondLargest = list.get(0);
        int largest = list.get(0);
        for (int i = 0; i < list.size(); i++)
        {
            if(list.get(i) > largest)
            {
                secondLargest = largest;
                largest = list.get(i);

                if(list.get(i) > secondLargest && list.get(i) != largest)
                {
                    secondLargest = list.get(i);
                }
            }
        }

        System.out.print("Second biggest number ");
        return secondLargest;
    }
}
