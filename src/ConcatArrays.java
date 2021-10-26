import java.util.Arrays;

public class ConcatArrays {
    /*
    Q16: Array -- Concat two arrays
Write a return method that can concate two arrays.
Instead of for loops, I used a different approach whic is string manupulation
Pseudo Code:
Get inputs from user and send to Cncat methd which accetts 2 string arrays and return 1 string array.
inside the method:
    -convert first array to string. skip first ch since it is [, and replace last character to , since it is ] and we need , to split.
    -convert second array to string. skip first ch since it is [, and replace last character to nothing since we don't need anything at the end of string
    add those 2 strings together and splt back to array and return it.
     */
    public static String[] Concat(String[] a, String[] b){
        return (Arrays.toString(a).substring(1).replaceAll("]",",")+Arrays.toString(b).substring(1).replaceAll("]","")).split(",");

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Concat("abcd".split(""),"12345".split(""))));
    }
}
