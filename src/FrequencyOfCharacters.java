public class FrequencyOfCharacters {
    /*
    Q1: String -- Frequency of Characters Write a return method that can find the frequency of characters Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
    PSEUDO CODE:
    -Get input(hardcode or scanner) to string variable
    -send input to Find Frequency Method (Returns string accepts one string)
        -split input to array
        -create empty text
        -iterate through array
        check if character at i is empty, if yes, skip steps below
            -start a nested loop from i+1
            -if character at j equals i increase count and replace j with ""
            -at the end of j loop. assign character i and count to text, and reset count
        -return text
     */
    public static String FindFrequency(String str){
        String [] arr=str.split("");
        String text="";
        int count=1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals("")) continue;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i].equals(arr[j])){
                    count++;
                    arr[j]="";
                }

            }
            text+=arr[i]+count;
            count=1;

        }
        return text;
    }


    public static void main(String[] args) {
        String str="aaaabbcccabce";
        System.out.println(FindFrequency(str));
    }
}
