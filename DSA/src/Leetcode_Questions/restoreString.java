package Leetcode_Questions;

import java.util.ArrayList;

public class restoreString {
    public static String restoreString(String s, int[] indices) {

        char[] se=new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            se[indices[i]]=s.charAt(i);
        }
        return new String(se);
    }

    public static void main(String[] args) {
        String s="codeleet";
        int[] indices={4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s,indices));
    }
}
