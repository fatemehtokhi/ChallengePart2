import java.util.*;

public class WeightForWeight {
    public static  String orderWeight(String strng) {
        //if (!strng.trim().contains(" ")) {
            System.out.println(strng);
           // return strng;
        }
        
    
        /*
        System.out.println(strng);
        StringBuilder answer = new StringBuilder();
        String[] weights = strng.split(" ");
        long[] values = new long[weights.length];
        Hashtable<Long, LinkedList> strVal = new Hashtable();
        Arrays.sort(weights);
        for (int i = 0; i < weights.length; i++) {
            values[i] = Long.decode(weights[i]).longValue();
            int j = 1;
            int weight = 0;
            while (values[i] / Math.pow(10, j) > 0) {
                weight += (values[i] % Math.pow(10, j)) / Math.pow(10, j - 1);
                values[i] -= values[i] % Math.pow(10, j);
                j++;
            }
            values[i] = weight;
            LinkedList<String> val = new LinkedList();
            if (strVal.containsKey(values[i])) {
                val = strVal.get(values[i]);
            }
            val.add(weights[i]);
            strVal.put(values[i], val);
        }
        Arrays.sort(values);
        for (int i = 0; i < values.length; i++) {
            if (strVal.containsKey(values[i])) {
                for (int h = 0; h < strVal.get(values[i]).size(); h++) {
                    answer.append(strVal.get(values[i]).get(h));
                    answer.append(" ");
                }
                strVal.remove(values[i]);
            }
        }
        return answer.toString().trim();
    }*/
}
    public static void main(String[] args) {
        String weight = "100 45 76 99 101 78";
        orderWeight(weight);
    }
}
