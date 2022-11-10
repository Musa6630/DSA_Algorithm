package Linear_Search;

public class Char_Search {
    static boolean Char_Search(String s, char target)
    {
        if (s.length()==0)
        {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==target)
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s="MD MUSABBIR AFQUE";
        char target='S';
        System.out.println(Char_Search(s,target));
    }
}
