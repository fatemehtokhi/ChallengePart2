import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Atoms {
    public static void getcount(String str) {
        Map<String, Integer> mp = new LinkedHashMap<String, Integer>();
        for (int i = 0; i <= str.length(); i++) {
             int count = 0;
            Character c = str.charAt(i);
            String a = "";
            a = String.valueOf(c);
            if (a.matches("[A-Z]")) {
                for (int j = i + 1; j <= str.length(); j++) {                
                     Character b = str.charAt(j);
                    String d = String.valueOf(b);
                    if (d.matches("[a-z]")) {
                            a += b;
                            if (mp.get(a) == null)
                                mp.put(a, 1);
                            else
                                mp.put(a, mp.get(a) + 1);
                            count = 1;
                    }
                    else if (d.matches("[\\d]")) { 
                            int k = Integer.parseInt(d);
                            mp.put(a, k);
                            count = 1;
                    } 
                    else {
                        i = j - 1;
                        break;
                    }
                } 
                if(count==0){
                        if(mp.get(a)==null)
                        mp.put(a,1);
                        else
                        mp.put(a,mp.get(a)+1);
                }        
            } 
        }
        System.out.println("\nAtom count:");
        for(Map.Entry<String,Integer> entry:mp.entrySet());
            System.out.println(entry.getkey() + " " + entry.getValue());
            mp.clear();
    }
    public static void main(String[] args) {
        
        String str = "Fe2H3"; 
        System.out.println("Given molecule: "+ str); 
        getcount(str); 
        
    }
}

