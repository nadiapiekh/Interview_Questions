package PracticeForProgress;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(getPalindrome("racecar"));
    }
    public static boolean getPalindrome (String word){

        String reverse = "";

        for (int i = word.length()-1; i>=0; i--){
            reverse +=word.charAt(i);
        }
        return reverse.equals(word);
    }
}
