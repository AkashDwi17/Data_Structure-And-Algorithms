package Backtracking;
import  java.util.*;

public class _1FindSubSets {
    public static void findSubSets (String str, String ans, int i){
        if (i == str.length()){
            System.out.println (ans);
            return;
        }
        findSubSets(str, ans+str.charAt(i), i+1);
        findSubSets(str, ans, i+1);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubSets(str, "", 0);
    }
}

// ================================  Second Approach Using SB===========================


// public static void findSubsets(String str, StringBuilder sb , int i){
//         if  (i == str.length()){
//             if (sb.length() == 0){
//                 System.out.println("null");
//             }
//             System.out.println (sb.toString ());
//             return;
//         }
//         findSubsets(str, sb.append(str.charAt(i)), i+1);
//         sb.deleteCharAt(sb.length()-1);
//         findSubsets(str, sb, i+1);
//     }