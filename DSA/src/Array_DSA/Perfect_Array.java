package Array_DSA;

public class Perfect_Array
{

    public static boolean IsPerfect(int[] a)
    {
        // Complete the function
        int i = 0;
        int end = a.length - 1;
        while (i < end)
        {
            if (a[i] != a[end])
            {
                return false;
            }
            i++;
            end--;
        }
        return true;
    }



        public static void main(String[] args)
        {
            int[] a={1,2,3,2,1};
            if (IsPerfect(a))
                System.out.println("Perfect");
            else
                System.out.println("Not Perfect");
        }
    }


