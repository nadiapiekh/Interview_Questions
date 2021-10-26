import java.util.Scanner;

public class PermutationWithRecursion {
    public static String Permutation(String prefix, String str){
        int n = str.length();
        if (n == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                Permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a string: ");
        Permutation("",scanner.nextLine());
    }
}
