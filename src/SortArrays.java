import java.util.Arrays;

public class SortArrays {
    /*
    Q11: Array -- Sort Ascending
    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    Q12: Array -- Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex:  int[] arr = {10,20,7, 8, 90};
              arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};
    Ex:
          int[] arr = {10, 9, 8, 7};
           arr = Sort(arr);         ==>{ 7, 8, 9, 10};
   Pseudo Code:
   Create and array and sent is to sortAscending Method
   Ascending(lowest->highest)
    -we will iterate through array on the first loop
    -we will compare each element at i index to rest of the array
        -if there is a lower valu at the rest of the array we will swap it with the element at the i index
        this is called selection sort and logic is basicall find min value and sawp to 0, then find next min value on the rest of array and assign to next and next next and so on.
   sortDescending(bubble sort)
   we will iterate through array
   compare each item to the item next to it, if next item is less then item at index i, we will swap
   and we iterate again and again n^2 times.
   Basically bubble sort, sorts array litle by litle, and moves the lowest value to the end, while also movew bigger values to left
*/
    public static int[] sortAscending(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    public static int[] sortDescending(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums={0,9,8,7,6,5,45,4,234,23,-234,2};
        System.out.println(Arrays.toString(sortAscending(nums)));
        System.out.println(Arrays.toString(sortDescending(nums)));

    }
}