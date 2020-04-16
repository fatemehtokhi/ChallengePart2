import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Join2ListStream {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        List<Integer> list3 = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
        list1.add(23);
        list2.add(34);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
    }

}