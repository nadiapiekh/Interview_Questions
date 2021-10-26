public class SameLetters {
    /*
    Q2: String -- Same letters Write a return method that check if a string is build out of the same letters as another string. Ex: same("abc", "cab"); -> true same("abc", "abb"); -> false:
    PSEUDO CODE:
    -Get input from  the user and send compare method as compare(str1,str2)&&compare(str2,str1)
    start compare method which returns boolean and accepts 2 strings
    start for each loop for str1 and then for str2(nested loops)
    if i is equals to j, increase count
    end of j check if count bigger than 0, if no return false
    end of the i loop return true;
     */
    public static boolean compare(String a, String b){
        int count=0;
        for (char i:a.toCharArray()) {
            for (char j:b.toCharArray()) {
                if(i==j) count++;
            }
            if(count<1) return false;
            count=0;

        }
        return true;
    }


    public static void main(String[] args) {
        String str1="abb", str2="aab";
        System.out.println(compare(str1,str2)+" AND "+compare(str2,str1)+" = "+(compare(str1,str2)&&compare(str2,str1)));
    }
}
