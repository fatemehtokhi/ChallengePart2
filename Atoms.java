import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Atoms {//beginn class
    public static void getcount(String str) {//beginn method
        Map<String, Integer> mp = new LinkedHashMap<String, Integer>();
        for (int i = 0; i <= str.length(); i++) {//beginn outer for loop
             int count = 0;
            Character c = str.charAt(i);
            String a = "";
            a = String.valueOf(c);
            if (a.matches("[A-Z]")) {//beginn "if" in outer loop
                for (int j = i + 1; j <= str.length(); j++) {//beginn inner "for" loop
                    Character b = str.charAt(j);
                    String d = String.valueOf(b);
                    if (d.matches("[a-z]")) {//beginn "if" in inner loop 
                            a += b;
                            if (mp.get(a) == null)
                                mp.put(a, 1);
                            else
                                mp.put(a, mp.get(a) + 1);
                            count = 1;
                    }//end of "if" in inner loop 
                    else if (d.matches("[\\d]")) {//beginn "else if" in inner loop 
                            int k = Integer.parseInt(d);
                            mp.put(a, k);
                            count = 1;
                    }//end of "else if" in inner loop  
                    else {//beginn agian "else" in inner loop
                        i = j - 1;
                        break;
                    }//end of "else" in inner loop
                }//end of inner loop 
                if(count==0){//beginn "if" in outer  loop
                        if(mp.get(a)==null)
                        mp.put(a,1);
                        else
                        mp.put(a,mp.get(a)+1);
                }//end of "if" in outer loop        
            }// end of "if" in outer loop 
        }//end of "for" outer loop
        System.out.println("\nAtom count:");
        for(Map.Entry<String,Integer> entry:mp.entrySet());
            System.out.println(entry.getkey() + " " + entry.getValue());
            mp.clear();
    }//end method
    public static void main(String[] args) {
        //System.out.println("Please Enter Name of Atoms:");
        
        String str = "Fe2H3"; 
        System.out.println("Given molecule: "+ str); 
        getcount(str); 
        
    }
}//end of class

