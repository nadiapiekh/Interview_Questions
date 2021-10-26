import java.util.Arrays;

public class SortLetters {
    /*
    Q6: String -- Sort Letters and Numbers from alphanumeric String: Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together Ex: Input: "DC501GCCCA098911" OutPut: "CD015ACCCG011899"
    Pseudo Code:
    Get a string from the user and send it to Sort method
    Sort method accepts one string and returns string
    Create 3 empty Strings
        -Letters: we'll put each letter group in it and sort it
        -num: we'll put each number group in it and sort it
        -text:we'll put new sorted letters and num to this and return at the end
    Iterate through the str
    check if character is letter or number
        -if letter add to letters
        -if number add to num
    check if both of letters and num has characters
        if not that means we are still on letters or number group keep going through str
        if both letters and num has character that means one group is over and we just started to next group
        we'll check our current position on str to see are we on letter or on number
            -if we are on letter, we need to send number to sort, and add new sorted lnumber to text and reset num
            -if we are on a number character, send letters to sort, add new sorter letters to text, and reset letters
         This algorith will not sort and add the last group either letter ot number since either of them will be empty and it will not trigger if that we multiply lengths
         so last group will be added manually
         and return text
     */
    public static String stringSort(String str){
        /*
        split all letters/num to a string array,
        sort array
        convert array to string and remove all non-letter and non numeric characters  and return it
        all letters and numbers are one group in regex and \\w means all letters and number
        \\W meaans all non letters and non numbers
        so, if we replace all \\W, it will delete all non letters, and non-numbers
         */
        String [] arr = str.split("");
        Arrays.sort(arr);
        return Arrays.toString(arr).replaceAll("\\W","");
    }
    public static String Sort(String str){
        String letter="", num="";
        String text="";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 64) letter += "" + str.charAt(i);
            else num += "" + str.charAt(i);
            if (letter.length() * num.length() > 0) {
                if(str.charAt(i)>64) {
                    //sort nums
                    text+=stringSort(num);
                    //add to text
                    //reset num
                    num="";
                } else {
                    text+=stringSort(letter);
                    letter="";
                }
            }
        }
        if(num.length()>0) text+=stringSort(num);
        if(letter.length()>0) text+=stringSort(letter);
        return text;
    }
    public static void main(String[] args) {

        String str="0DC501GCCCA098911";

        System.out.println(Sort(str));
    }
}
