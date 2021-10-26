public class SumOfStrings {
    /*
       Q8:String -- sum of digits in a string: Write a method that can return the sum of the digits in a string.
       User will enter an input and send it to Sum methog which returns an int and accepts one String
       First, we will make sure there is no non-numeric characters in it
       create an empty integer variable
       iterate through string
       convert each string to int and add to total
       at the end of loop, return total
     */
    public static int Sum(String str){
        str=str.replaceAll("\\D","");
        //System.out.println(str);
        int total=0;
        for (char i:str.toCharArray()) {
            total+=Integer.parseInt(""+i);
        }
        return(total);
    }
    public static void main(String[] args) {
        String str="1a1s1231k324k324kl23l32?1.";
        System.out.println(Sum(str));

    }
}
