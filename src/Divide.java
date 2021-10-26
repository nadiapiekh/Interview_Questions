public class Divide {
    /*
    Q18: Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator.
Pseudo Code-
Get input from user and send to Divide method which accepts 2 int and returns 1 int
start an empty int variable
while num bigger than divisor, subtract divisor from number and increase counter
at the end return count
     */
    public static int Divide(int num, int div){
        int count=0;
        while (num>div){
            num-=div;
            count++;
        }
        return count;
    }
    public static int Remain(int num, int div){
        //int count=0;
        while (num>div){
            num-=div;
            //count++;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println("Divide = " + Divide(13,2));
        System.out.println("Remains = " + Remain(13,2));
    }
}