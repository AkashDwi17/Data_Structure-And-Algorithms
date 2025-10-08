package ArrayList;
import java.util.*;

public class PairSumInSortedAndRotated {
    public static void pairSumInSortedAndRotated (ArrayList<Integer> list, int target){
        int bp = -1;
        int n = list.size();
        for (int i=0; i<list.size(); i++){
            if (list.get(i) > list.get(i+1)){
                bp = i;
                break;
            }
        }
        int si = bp+1;
        int ei = bp;
        while (si != ei){ //
            if (list.get(si)+list.get(ei) == target){
                System.out.println(si+","+ei);
                return;
            }
            if (list.get(si)+list.get(ei) < target){
                si = (si+1)%n;
            }else{
                ei = (n+ei-1)%n;
            }
        }
        System.out.println("Pair Not Found!");
    }
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        pairSumInSortedAndRotated(list, 16);
    }
}
