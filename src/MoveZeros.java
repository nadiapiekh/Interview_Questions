import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MoveZeros {
    /*
    Q15: Array -- Move zeros to the end
- Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
    PSEUDO CODE:
    enter size of array and add numbers randomly
    print random array
    call moveZeros method
    MoveZeros:
        create a temp int with array length-1;
        iterate through array
            if element equals 0, swap with arr[temp]
            temp--
        at the end of for loop return array
    print new array
     */
    public static int[] MoveZeros(int[] arr){
        int pos= arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            while(arr[pos]==0) pos--;
            if(i<pos && arr[i]==0)  {

                arr[i]=arr[pos];
                arr[pos]=0;
                //pos--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter arrays size= ");
        int arr[]=new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new Random().nextInt(10)-new Random().nextInt(10);
            if(i+1<arr.length) arr[i+1]=0;
            i++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(MoveZeros(arr)));

    }

}