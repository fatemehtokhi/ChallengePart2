import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class CheckG {
        public static boolean groupCheck(String s){
            String input[]= s.split("");
            HashMap<String,String> bracesHash = new HashMap<String,String>();
            bracesHash.put("(", ")");
            bracesHash.put("{", "}");
            bracesHash.put("[", "]");
            List<String> openBraces = new ArrayList<String>();
            for(int i=0; i <= input.length-1;i++){
                if(bracesHash.containsKey(input[i])){
                    openBraces.add(input[i]);  
                }else{
                    String element = openBraces.remove(openBraces.size()-1);
                   
                    if(!bracesHash.get(element).equals(input[i])){
                        return false;
                    }
                }

            }
            if(openBraces.size()>0) return false;

          return true;
        }
        public static void main(String[] args) {
            String input = "({";
            System.out.println(groupCheck(input));
            
        }
        
      }

