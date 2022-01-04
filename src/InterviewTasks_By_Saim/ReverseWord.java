package InterviewTasks_By_Saim;

public class ReverseWord {

    public static void main(String[] args) {
        System.out.println(reverseStr("nadia"));
        System.out.println(reverseStr("coffee"));
        System.out.println(reverseUsingBuffer("hello"));
    }
    public static String reverseStr (String str){
        String reversedWord= "";
        String reverseWord1 ="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversedWord+=str.charAt(i);
            reverseWord1+=str.toCharArray()[i];
        }
        return reversedWord+" "+reverseWord1;
    }
    public static String reverseUsingBuffer(String word){
        return new StringBuffer(word).reverse().toString();
    }
}
