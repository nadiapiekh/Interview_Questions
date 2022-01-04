package Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class FrequencyOfCharacters {
    /*
    Write a method that can find the frequency of characters.
    Ex. FrequencyOfChars ("AABBCDD") => A3B2C1D2
     */
    public static void main(String[] args) {
        // System.out.println(frequencyOfChars("Nadiia"));
        // System.out.println(FrequencyOfChars2("Nadiia"));
        // System.out.println(FrequencyOfChars3("Nadiia"));
        System.out.println(frequency("Nadiia"));
    }
    //Method 1 (using 3 loops):

    /**
     * 1)Create a method that will return String and accepts String in parameter;
     * 2)First loop will collect the non-duplicate characters and record it into String "nonDup";
     * 3) Second nested "for i" loop:
     * first loop: takes each character from the "nonDup" String;
     * second loop: takes each character from the original String;
     * Compare a character from the first loop to the character in the second loop:
     * If they match, use count++;
     * 4) Outside the nested loop, create a String variable that will store the expected result (Character+count);
     * 5) Return expected result;
     */

    public static String frequencyOfChars(String str) {
        String nonDup = "";
        for (int i = 0; i < str.length(); i++)
            if (!nonDup.contains("" + str.charAt(i)))
                nonDup += "" + str.charAt(i);
        String expectedResult = "";
        for (int j = 0; j < nonDup.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == nonDup.charAt(j))
                    count++;
            }
            expectedResult += nonDup.charAt(j) + "" + count;
        }
        return expectedResult;
    }

    //Method 2 (using 2 loops):
    /**
     * 1)Create a method that will return String and accepts String in parameter;
     * 2)Create two loops: "while" and "for i":
     * while loop: will iterate through each letter in the original String
     * for i loop: will take each character from the original String and compare to the rest of the String
     * create the count variable to count the duplicates
     * 3) Create an Expected result variable that will store the new String in a requested format (Letter+count)
     * 4) Use String replace method to remove the first character from the original string
     *    so the loop doesn't iterate through this character again
     */
    public static String FrequencyOfChars2(String str) {
        String expectedResult = "";
        int j = 0;
        while (j < str.length()) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            expectedResult += str.charAt(j) + "" + count;
            str = str.replace("" + str.charAt(j), "");
        }
        return expectedResult;
    }

    //Method 3 (using collections LinkedHashSet):
    /**
     * 1)Create a method that will return String and accepts String in parameter;
     * 2)Create a LinkedHashSet using the original String using Arrays.asList, string split and toString methods.
     * This will automatically remove the duplicate characters from the original String, as LinkedHashSet does not allow duplicates.
     * 3)Remove commas and square brackets by using replace method and store it back to this String;
     * 4)Create a variable outside the loop that will store a new String in a requested format (Character+count);
     * 5)Create a nested "for i" loops:
     * A)first loop: will iterate through the String (created used collections):
     * a)create a count variable that will keep track of duplicates;
     * B)second loop: will take each character from the String and compare to the rest of the String;
     * b)create an if statement: it will check if the character in the new string equals to the
     *   character from the original string using substring method. If so, it will add the number to count++;
     * 6)Record the result in the outer loop;
     * 7)Return the result in outside the loops;
     */
    public static String FrequencyOfChars3(String str) {
        String b = new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();
        b = b.replace(", ", "").replace("[", "").replace("]", "");
        String result = "";
        for (int j = 0; j < b.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.substring(i, i + 1).equals("" + b.charAt(j))) {
                    count++;
                }
            }
            result += b.substring(j, j + 1) + count;
        }
        return result;
    }

    //Method 4 (using Collections.frequency method):
    /**
     * 1)Create a method that will return String and accepts String in parameter;
     * 2)Create two variable: String for the NonDuplicate characters and String that will store the result in a requested format;
     * 3)Create a "for i" loop that will iterate through the original String and store the NonDuplicate characters in a new String:
     * a)use an "if statement" to check nonDup String contains the character, if it doesn't that store that character into NonDup String;
     * 4)Create a second "for i" loop that will iterate through NonDup String and compare to the original string by using Collections.frequency method;
     * a)store the result into result variable in a requested format (Character + count);
     * 5)Return the result in outside the loop;
     */
    public static String frequency(String str) {
        String nonDup = "", result = "";
        for (int i = 0; i < str.length(); i++)
            if (!nonDup.contains("" + str.charAt(i)))
                nonDup += "" + str.charAt(i);
        for (int i = 0; i < nonDup.length(); i++) {
            int num = Collections.frequency(Arrays.asList(str.split("")), "" + nonDup.charAt(i));
            result += "" + nonDup.charAt(i) + num;
        }
        return result;
    }
}





