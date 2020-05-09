import java.io.File;

public class CreatDirectory {
    public static void main(String[] args) {
        String alphabets[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z" };
        boolean value;
        File file;
        for (int i = 0; i <= alphabets.length - 1; i++) {
            file = new File("/home/fatemah/test/" + alphabets[i]);
            value = file.mkdir();
            if (value) {
                System.out.println(alphabets[i]+" directory is created");
            } else {
                System.out.println(alphabets[i]+" directory already exits");
            }
        }

    }
}