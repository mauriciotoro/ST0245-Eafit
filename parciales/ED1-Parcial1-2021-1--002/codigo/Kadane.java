import java.util.ArrayList;
import java.util.Collections;
class Kadane
{
    public static void main (String[] args)
    {
        Integer [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
	ArrayList<Integer> aa = new ArrayList<Integer>();
	Collections.addAll(aa,a);
        System.out.println("Maximum contiguous sum is " +
                                       maxSubArraySum(aa));
    }
 
    static int maxSubArraySum(ArrayList<Integer> a)
    {
        int size = a.size();
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
 
        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here) //esta!!!
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }
}
