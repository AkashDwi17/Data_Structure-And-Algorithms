package ArrayList;
import java.util.*;
public class PairSum {
    public static void pairSum (ArrayList<Integer> list, int target){
        int lp = 0;
        int rp = list.size()-1;
        while (lp < rp){
            if (list.get(lp) + list.get(rp) == target){
                System.out.println(lp +", "+ rp);
                return;
            }
            if (list.get(lp) + list.get(rp) < target){
                lp ++;
            }else{
                rp --;
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        pairSum(list, 8);
    }
}
