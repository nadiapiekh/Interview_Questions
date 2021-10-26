public class RemoveDuplicates {
    /*
    Q3: String -- Remove Duplicates. Write a return method that can remove the duplicated values from String Ex: removeDup("AAABBBCCC") ==> ABC
    Pseudo Code:
    -Get input(hardcode or scanner) to string variable
    -send input to removeDup (Returns string accepts one string)
        -split input to array
        -create empty text
        -iterate through array
        check if character at i is empty, if yes, skip steps below
            -start a nested loop from i+1
            -if character at j equals i increase count and replace j with ""
            -at the end of j loop. assign character i to text, and reset count
        -return text
     */
    public static String removeDup(String str){
        String [] arr=str.split("");
        String text="";

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals("")) continue;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i].equals(arr[j])){

                    arr[j]="";
                }

            }
            text+=""+arr[i];


        }
        return text;
    }


    public static void main(String[] args) {
        String str="aaaabbcccabce";
        System.out.println(removeDup(str));
    }
}
