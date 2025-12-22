package GreedyAlgorithm;
import java.util.*;

public class ActivitySelectionInSortedArray {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        ArrayList<Integer> ans = new ArrayList<>();
        int maxAct = 0;
        ans.add(0);
        maxAct = 1;
        int lastEnd = end[0];
        for (int i=1; i<end.length; i++){
            if (start[i] > lastEnd){
                ans.add (i);
                maxAct ++;
                lastEnd = end[i];
            }
        }
        System.out.println ("Maximum Activities: " + maxAct);
        for (int i=0; i<ans.size(); i++){
            System.out.print ("A"+ans.get(i) + " ");
        }

    }
}
