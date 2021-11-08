package PracticeForProgress;

public class NumberPalindrome {
    public static void main(String[] args) {

        int givenNumber = 1235321;
        //1) Create a temp variable that will hold the given number in each loop iteration
        int temp = givenNumber;

        //2) Create a variable that will store the reversed given number with the initial value of 0
        int newNum = 0;

        //3) Create a loop that will be reversing each digit staring from the back, using the formula.
        //   The loop will run until the temp variable is not equal to 0
        while (temp != 0) {
            newNum = newNum * 10 + temp % 10;
            temp = temp / 10;

        }
        System.out.println("The given number is palindrome: " + (newNum == givenNumber));
    }
}