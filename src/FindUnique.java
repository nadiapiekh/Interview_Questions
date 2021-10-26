public class FindUnique {
    /*
    Q4: String -- Find the unique Write a return method that can find the unique characters from the String Ex: unique("AAABBBCCCDEF") ==> "DEF";
    Pseudo Code:
    -get input from the user and send to findUnique which returns string and accepts one string
    -start an empty text string
    -start for each loop i
    - create and reset count
    -start for each loop j
    -check if i equals to j
        if yes, increase count
    -end of j loop check if count is 1
        -if yes add i to text
     -end of i loop return text
     */
    public static String findUnique(String str){
        String text="";

        for (char i:str.toCharArray()) {
            int count=0;
            for (char j:str.toCharArray()) {
                if(i==j) count++;
            }
            if(count<2) text+=""+i;
        }
        return text;
    }

    public static void main(String[] args) {
        String str="AAABBBCCCDEF";
        System.out.println(findUnique(str));

    }
}
