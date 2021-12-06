package InterviewTasks_By_Saim;

import java.util.Arrays;
import java.util.Collections;

public class StringFindUnique {
    /*
    Write a return  method that can find the unique characters from the String
     Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */

   //Method 1
    public static String unique(String str) {

        String[] arr = str.split("");
        String unique1 = "";
        for (int j = 0; j < arr.length; j++) {
            int num = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(arr[j]))
                    num++;
            }
            if (num == 1)
                unique1 += arr[j];
        }
        return unique1;
    }

    //Method 2
    public static String Unique2(String str) {
            String result ="";
            for(String each : str.split(""))
                result +=(  (Collections.frequency(Arrays.asList(str.split("")), each)) ==1 ) ? each : "";
            return result;
        }
}
