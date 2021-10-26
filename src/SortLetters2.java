import java.util.*;

public class SortLetters2 {
    /*
    Q6: String -- Sort Letters and Numbers from alphanumeric String: Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together Ex: Input: "DC501GCCCA098911" OutPut: "CD015ACCCG011899"
    get input and send to Sort method
    -create a letters array that have each letter group in string
    -create a nubers array that have each number group in string
    -Sort each element in the arrays
    -put back elements in the arrays based on string
        -if string starts with letter take first element of letters than first element of numbers
        -if string starts with number take first element of numbers than first element of letters
    -return and print new in-group sorted str
     */
    public static String sortString(String str){
        /*
        split all letters/num to a string array,
        sort array
        convert array to string and remove all non-letter and non-numeric characters  and return it
         */
        if(str.length()==0) return str;
        else{
            String[] text=str.split("");
            Arrays.sort(text);
            return Arrays.toString(text).replaceAll("\\W","");
        }
    }
    public static String print(String[] a, String[] b){
        /*
        This method will take 2 arrays letters and numbers
        each array has our letters and number groups as sorted
        based on parameter order, it will add all elements in the arrays to a text string and return it
        it will add like that:
            add first element of a to text and add first element of b to text
            add second element of a to text and add second element of b to text
            add third element of a to text and add third element of b to text
            add fourth element of a to text and add fourth element of b to text
         */

        String  text="";
        for (int i = 0; i < a.length; i++) {
            if(i<a.length) text+=a[i];
            if(i<b.length) text+=b[i];
        }
        return  text;
    }
    public static String Sort(String str){
        //we split str in two arrays one takes letters as group, one takes numbers as group
        String[] letter=str.split("\\d+");//[DC, GCCCA]
        String [] num=str.replaceAll("\\D+",",").substring(1).split(",");//[501, 098911]

        //String[] num=str.split("[a-zA-Z]+");//[, 501, 098911] - Optimized above
        System.out.println("Letters: "+Arrays.toString(letter)+"\nNumbers: "+Arrays.toString(num));
        //we sort each element in both arrays
        for (int i = 0; i < letter.length; i++) {
            letter[i]=sortString(letter[i]);
        }
        for (int i = 0; i < num.length; i++) {
            num[i]=sortString(num[i]);
        }

        //we check if str starts with letter or number because we'll decide if we pick first from letters or numbers
        if(str.charAt(0)>64) return(print(letter,num));
        else return(print(num,letter));
    }

    public static void main(String[] args) {
        /*
        Enter text
        Create letters and numbers array
        sort each array's element
        check if str start with letter or number
        then based on start pick one element from each other
        put arrays' elements in order back together
         */
        String str="DC501GCC54154ChjvhvA0989jhvjv11a";

        System.out.println(Sort(str));

    }
}