import java.util.HashMap;
import java.util.Map;

public class Twosum {
    public static int[] twosum(int[] number, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= number.length; i++) {
            int difference = target - number[i];
            if (map.containsKey(difference)) {
                return new int[] { i, map.get(difference) };
            }
            map.put(number[i], i);

        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int number[] = {2,3,4,6,11};
        int target = 8;
        int result[] =twosum(number, target);
        System.out.println();
        System.out.println("{"+result[0]+","+result[1]+"}");
        
    }

}