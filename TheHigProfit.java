import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class TheHigProfit {
    public static Integer findmax(List<Integer> list) {
        if (list == null || list.size() == 0) { 
            return Integer.MAX_VALUE; 
        } 
        List<Integer> sortedlist = new ArrayList<>(list);  
        Collections.sort(sortedlist); 
        return sortedlist.get(0); 
    }
    public static Integer findmin(List<Integer> list) {
        if (list == null || list.size() == 0) { 
            return Integer.MIN_VALUE; 
        } 
        List<Integer> sortedlist = new ArrayList<>(list);  
        Collections.sort(sortedlist); 
        return sortedlist.get(sortedlist.size() - 1); 
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(23);
        list.add(2);
        list.add(230);
        list.add(1);
        System.out.println("["+findmax(list)+","+findmin(list)+"]");
        

    }

}