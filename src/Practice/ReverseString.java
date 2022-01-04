package Practice;

public class ReverseString {
    /*
    Reverse String method
    */

    //Calling a method to verify
    public static void main(String[] args) {
        System.out.println(reversedWord("Nadiia"));
        System.out.println(reversedWord1("Coffee"));
    }

    //Method 1 using a loop:
    /**
     *  1)Create a method that will return String and accepts String in parameter;
     *  2)Create a new String that will store a reversed word;
     *  3)Create a loop that will go from the last index of the String to the first index and store the characters to the new String;
     *  4)Return the new String in outside the loop;
     */
    public static String reversedWord(String str) {
        String reversedWord = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            //reversedWord+=str.charAt(i);         //using CharAt
            reversedWord += str.toCharArray()[i]; //using toCharArray
        }
        return reversedWord;
    }

    //Method 2 using String Buffer
    /**
     * 1)Create a method that will return String and accepts String in parameter;
     * 2)Return a new String using a new StringBuffer and reverse and toString methods;
     */
    public static String reversedWord1(String str) {
        return new StringBuffer(str).reverse().toString();
    }
}
