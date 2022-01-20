package InterviewTasks_By_Saim;

import java.util.Arrays;
import java.util.TreeSet;

public class StringSameLetters {

    /**
     * Write a return method that checks if a string is build out of the same letters as another string.
     * Ex:  same("abc",  "cab"); -> true
     * same("abc",  "abb"); -> false:
     */

    public static void main(String[] args) {
        System.out.println(same("abc", "cab"));
        System.out.println(Same("abc", "cab"));
    }
    //Method 1:
    /**
     * 1)Make a method that will return a boolean and accepts two strings;
     * 2)Make two char Arrays for each string;
     * 3)Sort arrays using Arrays.sort method;
     * 3)Declare two string variables;
     * 4)Create two each loops to go through each element in each array;
     * 5)Add each element to new string variable;
     * 6)Compare two strings in return line by using equals method;
     */
    public static boolean same(String a, String b) {
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String a1 = "", a2 = "";
        for (char each : ch1)
            a1 += each;
        for (char each : ch2)
            a2 += each;
        return a1.equals(a2);
    }

    // Method 2 (using ThreeSet):

    /**
     *1)Make a method that will return a boolean and accepts two strings;
     *2)Create two strings using TreeSet(which will sort string in alphabetical order;
     *3)Compare two strings in return line by using equals method;
     */
    public static boolean Same(String str1, String str2) {
        str1 = new TreeSet<String>(Arrays.asList(str1.split(""))).toString();
        str2 = new TreeSet<String>(Arrays.asList(str2.split(""))).toString();
        return str1.equals(str2);
    }
}
