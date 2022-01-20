package InterviewTasks_By_Saim;

import java.util.Arrays;

public class ArrayFindMaximum {
    /**
     * Write a method that can find the maximum number from an int Array
     */

    //Method 1:
    public static int maxValue(int[] n) {
        int max = Integer.MIN_VALUE;
        for(int each: n)
            if(each > max)
                max = each;
        return max;
    }
    //Method 2:
    public static int maxValue1(int[] n) {
        Arrays.sort(n);
        return n[n.length-1];
    }
}
