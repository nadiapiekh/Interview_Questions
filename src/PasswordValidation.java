
import java.util.Scanner;

public class PasswordValidation {
    /*
          Q7:String -- Password Validation Task 1: Write a return method that can verify if a password is valid or not.
    Requirements:
     1. Password MUST be at least have 6 characters and should not contain space.
     2. Password should at least contain one upper case letter
     3. Password should at least contain one lowercase letter
     4. Password should at least contain one special characters
     5. Password should at least contain a digit if all requirements above are met, the method returns true, otherwise returns false
    Pseudo Code:
    Get an input from user
    if validate password return true it is secure password
    if not, ask user to enter a new password
         */
    public static boolean validate(String str) {
        /*create an empty text and add validation message to it
          check if password long enough
          check if password doesn't have space
          check if password has upper case
          check if password has lower case
          check if password has special character
          check if password has number
          if text is empty, secure password return true
          if not, non-secure password print the validation messages, and return false
         */
        String text = "";
        if (str.length() < 6) text += "\nYour password must be at least 6 characters";
        if (str.contains(" ")) text += "\nYour password can't have space";//update
        if (str.replaceAll("[^A-Z]", "").length() < 1)
            text += "\nYour password must have at least one upper case character";
        if (str.replaceAll("[^a-z]", "").length() < 1)
            text += "\nYour password must have at least one lower case character";
        if (str.replaceAll("\\w", "").length() < 1) text += "\nYour password must have at least one special character";
        if (str.replaceAll("\\D", "").length() < 1) text += "\nYour password must have at least one numeric character";
        if (text.length() < 1) return true;
        else {
            System.out.println(text);
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String password = "";
        do {
            System.out.println("Please enter a valid password!");
            password = scan.nextLine();
        } while (!validate(password));
        System.out.println("Great, your password accepted!");
        System.out.println("Your password is " + password);

    }
}


