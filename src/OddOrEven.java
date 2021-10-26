public class OddOrEven {
    /*
    Q17:  Numbers -- odd & even
Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even".
Pseudo Code:
Get input from user and send to check method which accepts one int and return string
check if number division 2 remainder is 0 or not. if zero even if not odd.
     */
    public static String check(int num){
        return (num%2==0?"Even":"Odd");
    }

    public static void main(String[] args) {
        System.out.println(check(13));
    }
}