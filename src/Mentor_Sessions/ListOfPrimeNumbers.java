package Mentor_Sessions;

public class ListOfPrimeNumbers {
    /*
    Numbers – generate a list of prime number
    Write a method generate a list of prime numbers form 1 until N. N cannot be larger than 1000.
     */

    public static void ListOfPrime(int n) {
        if (n > 1 && n < 1000) {
            int temp =2;
            for (int i = 2; i <= n; i++) {
                if (temp % i != 0) {
                    System.out.print(temp + " ");
                }
                temp++;
            }
        }
    }

    public static void main(String[] args) {
        ListOfPrime(10);
    }
}
