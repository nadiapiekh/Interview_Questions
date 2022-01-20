package InterviewTasks_By_Saim;

import java.util.Arrays;

public class ArrayFindMenimum {
    /**
     * Write a method that can find the maximum number from an int Array
     */

    //Method 1:
    public static int maxValue(int[]n) {
        int min = Integer.MAX_VALUE;
        for(int each: n)
            if(each < min)
                min = each;
        return min;
    }

   //Method 2:
    public static int maxValue1(int[]n) {
        Arrays.sort(n);
        return n [0];
    }
}
