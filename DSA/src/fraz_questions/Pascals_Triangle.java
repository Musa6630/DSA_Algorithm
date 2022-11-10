package fraz_questions;

import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle {
    public static List<List<Integer>> pascals_Triangle(int row_num)
    {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> row,pre=null;
        for (int i = 0; i < row_num; i++) {
            row=new ArrayList<Integer>();
            for (int j = 0; j <=i ; j++) {
                if (j==0||j==i)
                {
                    row.add(1);
                }
                else
                {
                    row.add(pre.get(j-1)+ pre.get(j));
                }
            }
            pre=row;
            res.add(row);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(pascals_Triangle(5));
    }
}
