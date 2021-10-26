package PracticeForProgress;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {2,4,6,2,5};
        System.out.println(Arrays.toString(reverseArray(arr)));
    }

    public static int [] reverseArray (int [] arr){
        int [] newArr =new int [arr.length];

        int temp = 0;

        for (int i = arr.length-1; i>=0; i--){
            newArr [temp++] =arr[i];
        }
        return newArr;
    }
}
