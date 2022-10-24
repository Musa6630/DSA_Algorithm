package Array_DSA;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_2D {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        int m= in.nextInt();
        for (int i = 0; i < m; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
