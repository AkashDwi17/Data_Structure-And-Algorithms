package GreedyAlgorithm;
import java.util.*;

public class ActivitySelectionInUn_sortedData {
    public static void main(String[] args) {
        int start[] = {0,1,3,5,5,8};
        int end [] = {2,4,6,7,9,9};

        int activities[][] = new int [start.length][3];
        for (int i=0; i<start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        Arrays.sort (activities, Comparator.comparingDouble(o->o[2]));
        ArrayList<Integer> list = new ArrayList<>();

        int maxAct = 0;
        int lastEnd = activities[0][2];
        maxAct = 1;
        list.add (activities[0][0]);

        for (int i=1; i<end.length; i++){
            if (activities[i][1] > lastEnd){
                list.add (activities[i][0]);
                maxAct ++;
                lastEnd = activities[i][2];
            }
        }
        System.out.println("MaxAct: " + maxAct);
        for (int i=0; i<list.size(); i++){
            System.out.println("A"+list.get(i));
        }
    }
}
