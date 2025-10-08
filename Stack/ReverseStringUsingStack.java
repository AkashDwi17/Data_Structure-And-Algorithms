package Stack;
import java.util.*;

public class ReverseStringUsingStack {
    public static String reverseString (String str){
        Stack <Character> s = new Stack<>();
        StringBuilder sb = new StringBuilder("");
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            s.push (ch);
        }
        while (!s.isEmpty()){
            sb.append(s.pop());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "raghuvendra";
        System.out.println (reverseString(str));
    }
}
