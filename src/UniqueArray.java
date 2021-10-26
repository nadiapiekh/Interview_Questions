import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class UniqueArray {
    /*
    13. Array -- N unique integers that sum up to 0
    Write a function: that, given an integer N (1 < N < 100), returns an array
    containing N unique integers that sum up to 0. The function can
    return any such array.
    For example, given N = 4, the function could return [1,0, -3,2] or
    [-2,1, -4,5]. The answer [1, -1,1,3] would be incorrect (because
    value 1 occurs twice). For N = 3 one of the possible answers is [-1,0,1]
    (but there are many more correct answers).
    Pseudo Code:
    Get a int number from the user
    send this number to generate method
    create a int array with n
    iterate through array length-1 (because the last number will be our balancing number)
    generate a random number between -10 to 10
    check if number is already in the array (contains method)
        Contains method:
        accept 2 parameters (int array, and the int we'll check if it is in the array)
        go through the array
        if element in the array equals to other parameter
        return true
        if for loop completes return false
    if not, set arr[i] to random number, if yes, generate another one
    when iteration is over, find the total
    reverse it to negative or positive
    check if balancing number is already in the array
    if yes, call generate again(recursion)
    if no, add balancing number to last position on the array
    return int array
     */
    public static int[] generate(int n){
        int[] arr=new int[n];
        int temp;
        for (int i = 0; i < n-1; i++) {

            do{
                temp=new Random().nextInt(100)-new Random().nextInt(100);
            } while(contains(arr,temp));
            arr[i]=temp;
        }

        temp=-1* Arrays.stream(arr).sum();
        if(!contains(arr,temp)) arr[n-1]=temp;
        else generate(n);
        return arr;

    }
    public static boolean contains(int[] arr, int temp){
        for (int i:arr) {
            if(i==temp) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        System.out.println(Arrays.toString(generate(scanner.nextInt())));
    }

}