public class FindMinMax {
     /*
        Q9:Array -- Find Maximum:  Write a method that can find the maximum number from an int Array.
        Q10:Array -- Find Minimum: Write a method that can find the maximum number from an int Array.
      */

    public static int Min(int[] nums){
        int min=nums[0];
        for (int i = 0; i < nums.length; i++) {

            if(nums[i]<min) min=nums[i];
        }
        return min;
    }
    public static int Max(int[] nums){
        int max=nums[0];
        for (int i = 0; i < nums.length; i++) {

            if(nums[i]<max) max=nums[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,4,3,12,213,123,123,13,0,-10};
        System.out.println("Min = " + Min(nums));
        System.out.println("Max = " + Max(nums));

    }
}
