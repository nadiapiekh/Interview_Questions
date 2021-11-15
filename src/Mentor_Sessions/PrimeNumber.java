package Mentor_Sessions;

public class PrimeNumber {
    /*
    Write a method that can check if a number is prime or not.
     */
    public static boolean primeNumber(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(primeNumber(7));

    }
}
