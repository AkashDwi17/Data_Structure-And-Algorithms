import java.util.*;
public class Main {
    public static void findSubsets(String str, StringBuilder sb , int i){
        if  (i == str.length()){
            if (sb.length() == 0){
                System.out.println("null");
            }
            System.out.println (sb.toString ());
            return;
        }
        findSubsets(str, sb.append(str.charAt(i)), i+1);
        sb.deleteCharAt(sb.length()-1);
        findSubsets(str, sb, i+1);
    }
    public static void main (String args[]){
        String str = "abc";
        findSubsets(str, new StringBuilder(), 0);
    }
}
