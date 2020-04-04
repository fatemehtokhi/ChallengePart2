import java.util.*;

public class Consecutivesum {
    public static List<Integer> sumConsecutive(final List<Integer> s) {

        List<Integer> finalList = new ArrayList<Integer>();
        Set<Integer> hs = new HashSet<Integer>();
        hs.addAll(s);
        List<Integer> uniqList = new ArrayList<Integer>();
        uniqList.addAll(hs);
        int count = 0;
        for (int element : uniqList) {
            count = Collections.frequency(s, element);
            finalList.add(count * element);
        }
        Collections.sort(finalList);

        return finalList;
    }

    public static void main(final String[] args) {
        final List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(-2);
        list.add(-2);

        System.out.println(sumConsecutive(list));

    }

}
