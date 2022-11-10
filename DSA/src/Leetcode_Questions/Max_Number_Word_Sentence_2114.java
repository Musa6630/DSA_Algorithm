package Leetcode_Questions;

import java.util.Arrays;
import java.util.Objects;

public class Max_Number_Word_Sentence_2114 {
        public static int mostWordsFound(String[] sentences) {
            int max = 1;
            for (String sentence : sentences) {
                String[] arr = sentence.split(" ");
                max = Math.max(max, arr.length);
            }
            return max;
        }

    public static void main(String[] args) {
        String[] arr={"thi"};
        System.out.println(mostWordsFound(arr));
    }
}
