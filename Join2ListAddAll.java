import java.util.ArrayList;
import java.util.List;

public class Join2ListAddAll {
    public static void main(String[] args) {
     List<Integer> list1 = new ArrayList<Integer>(); 
     List<Integer> list2 = new ArrayList<Integer>();
     list1.add(1);
     list2.add(2);
     List <Integer> join = new ArrayList<Integer>();
     join.addAll(list1);
     join.addAll(list2);
     System.out.println("list1:"+list1);
     System.out.println("list2:"+list2);
     System.out.println("joinedList:"+join);
    }


}