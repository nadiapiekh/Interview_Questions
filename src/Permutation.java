import java.util.Arrays;
import java.util.Scanner;

public class Permutation {
    /*
    4. Array -- Permutation combinations
Given an array of 3 characters print all permutation combinations from the given characters.
    PSEUDO CODE:
    ask user to enter a string and send this string to Permutation method.
    create a char array
    create i loop for 3 and assign str[i] to arr[0]
    create j loop for 3 and assign str[j] to arr[1] if j!=i
    create k loop for 3 and assign str[k] to arr[2] if j!=k and i!=k
    print arr without special characters
     */
    public static void permutation(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < 3; i++) {
            arr[0] = str.charAt(i);
            for (int j = 0; j < 3; j++) {
                if (i == j) continue;
                else {
                    arr[1] = str.charAt(j);
                    for (int k = 0; k < 3; k++) {
                        if (j == k || i == k) continue;
                        else {
                            arr[2] = str.charAt(k);
                        }
                        System.out.println(Arrays.toString(arr).replaceAll("\\W", ""));
                    }
                }

            }

        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        permutation(scanner.nextLine().substring(0, 3));
    }
}