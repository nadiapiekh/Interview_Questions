package PracticeForProgress;

public class ReverseWords {

    public static void main(String[] args) {
        System.out.println(reverseWords("Java is fun!"));
    }

    public static String reverseWords (String sentence){
        String [] rev =sentence.split(" ");
        String reverse ="";

        for (int i = rev.length-1; i>=0; i--){
            reverse += rev[i]+" ";
        }
        return reverse.trim();
    }
}
