import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ConvertListToArray {
    public static void main(String[] args) {
        List <Integer> list =new ArrayList<Integer>();
        list.add(23);
        list.add(24);
        Integer [] array = new Integer [list.size()];
        list.toArray(array);
        System.out.println(Arrays.toString(array));
        
    }

}