import java.util.Arrays;

public class Reverse {
    /*
    Q5: String -- Reverse Write a return method that can reverse String Ex: Reverse("ABCD"); ==> DCBA
    Pseudo Code:
    get an input from the user
    send the input to reverse method
    -start reverse method as returns String ad accepts one string
    -create an empty text string
    -iterate through string
    -add each character to the beginning of text
     */
    public static String reverse(String str){
        String text="";
        for (char i:str.toCharArray()) {
            text=""+i+text;
        }
        return text;
    }
    public static void main(String[] args) {
        String str="AAABBBCCCDEF";
        System.out.println(reverse(str));

    }
}