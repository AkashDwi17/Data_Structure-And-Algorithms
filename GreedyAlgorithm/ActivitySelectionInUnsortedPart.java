package GreedyAlgorithm;
import java.util.*;

public class ActivitySelectionInUnsortedPart {
    public static void main(String[] args) {
        int start[] = {0,1,3,5,5,8};
        int end[] = {2,4,6,7,9,9};

        int activities[][] = new int [start.length][3];
        for (int i=0; i<start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort (activities, Comparator.comparingDouble(o->o[2]));
        int maxAct = 0;
        int lastEnd = activities[0][2];
        ans.add (activities[0][0]);
        maxAct ++;

        for (int i=1; i<end.length; i++){
            if (activities[i][1] > lastEnd){
                ans.add (activities[i][0]);
                maxAct ++;
                lastEnd = activities[i][2];
            }
        }

        System.out.println ("Max Activities: " + maxAct);
        for (int i=0; i<ans.size(); i++){
            System.out.print ("A"+ans.get(i)+" ");
        }
    }
}
