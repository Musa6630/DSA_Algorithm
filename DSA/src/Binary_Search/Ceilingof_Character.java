package Binary_Search;

public class Ceilingof_Character {
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println("Ceiling of " + target + " is " + letters[start]);
        return letters[start%letters.length];
    }

    public static void main(String[] args) {
        char[] letters={'c','f','j'};
        System.out.println(nextGreatestLetter(letters,'c'));
    }
}
