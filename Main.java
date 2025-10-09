import java.util.*;
public class Main{
    public static void main (String args[]){
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        ArrayList<Integer> list = new ArrayList<>();
        int maxAct = 0;
        list.add(0);
        maxAct = 1;
        int lastEnd = end[0];
        
        for (int i=1; i<end.length; i++){
            if (start[i] >= lastEnd){
                maxAct ++;
                list.add (i);
                lastEnd = end[i];
            }
        }
        System.out.println(maxAct);
        for (int i=0; i<list.size(); i++){
            System.out.println("A"+list.get(i));
        }
    }
}