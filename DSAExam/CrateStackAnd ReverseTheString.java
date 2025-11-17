import java.util.*;

public class Main{
    public static class Stack{
        static ArrayList <Character> list = new ArrayList<>();
        // is Empty
        public static boolean isEmpty(){
            return list.size() == 0;
        }
        public static void push (char data){
            list.add (data);
        }
        public static char pop (){
            if (isEmpty()){
                return '\0'; // An Empty Non Existing Character
            }
            char top = list.get(list.size()-1);
            list.remove (list.size()-1);
            return top;
        }
        public  static char peek(){
            if (isEmpty()){
                return '\0';
            }
            return list.get(list.size()-1);
        }
    }
    public static String reverse (String str){

        StringBuilder sb = new StringBuilder ("");
        Stack s = new Stack();
        for (int i=0; i<str.length(); i++){
            s.push (str.charAt(i));
        }
        while (!s.isEmpty()){
            sb.append (s.pop());
        }
        return sb.toString();
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        System.out.println("Reversed String: " + reverse(str));
    }
}
