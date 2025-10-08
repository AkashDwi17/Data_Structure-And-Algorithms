package Stack;
import java.util.*;
public class DublicateParenthesis {
    public static boolean dublicateParenthesis (String str){
        Stack <Character> s = new Stack<>();

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch == ')'){
                int count = 0;
                while (s.peek() != '('){
                    count ++;
                    s.pop();
                }
                if (count < 1){
                    return true;
                }
                else{
                    s.pop();
                }
            }else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "((a+(n(l()p))u))";
        System.out.println(dublicateParenthesis(str));
    }
}
