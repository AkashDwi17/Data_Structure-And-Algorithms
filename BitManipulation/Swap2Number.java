package BitManipulation;

public class Swap2Number {
    public static void main (String args[]){
        int x = 3;
        int y = 5;

        x = x^y;
        y = x^y;
        x = x^y;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
