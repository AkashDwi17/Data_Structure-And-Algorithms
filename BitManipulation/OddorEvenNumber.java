package BitManipulation;

public class OddorEvenNumber {
    public static void oddOrEven (int n){
        int bitMask = 1;

        if ((n&bitMask) == 0){
            System.out.println(n + " Is Even Number");
        }else{
            System.out.println(n + " Is Odd Number");
        }
    }
    public static void main(String[] args) {
        oddOrEven(5);
        oddOrEven(12);
    }
}
