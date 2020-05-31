
public class PigLatin {
    public static String findPigLatin(String str) {
        int i;
        String wordfinal3=" ";
        String[] words = str.split(" ");
        for (i = 0; i < words.length; i++) {
            
            if (words[i].charAt(i) != ' '){ 
                wordfinal3 = words[i].substring(i)+words[i].substring(0,i)+"ay";
            //System.out.println(i+"i is =");
            }else{
                System.out.println(" ");
            }

    }
    return wordfinal3;
}

    public static void main(String[] args) {

        System.out.println(findPigLatin("shafi"));
    }

}