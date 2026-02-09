package ArrayList;
import java.util.*;

public class PairSumInSortedAndRotated {
    public static void pairSumInSortedAndRotated (ArrayList<Integer> list, int target){
        int bp = -1;
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

        //  handle non-rotated array
        if (bp == -1) {
            bp = n - 1;
        }

        int lp = (bp + 1) % n;
        int rp = bp;

        while (lp != rp) {
            int sum = list.get(lp) + list.get(rp);

            if (sum == target) {
                System.out.println(list.get(lp) + " , " + list.get(rp));
                return;
            }

            if (sum < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (rp + n - 1) % n;
            }
        }
        System.out.println("Not FOUND!");
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
