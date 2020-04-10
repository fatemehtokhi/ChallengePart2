import java.util.*;

public class Splitstring {
    public static String[] solution(String s) {
        String[] chars = s.split("");
        List<String> dst = new ArrayList<String>();
        // System.out.println(s+", length: "+chars.length);

        for (int i = 0; i < chars.length; i += 2) {
            if (i < chars.length - 1)
                dst.add(chars[i] + chars[i + 1]);
        }

        if (chars.length % 2 == 1)
            dst.add(chars[chars.length - 1] + "_");

        System.out.println(dst);

        return dst.toArray(new String[dst.size()]);

    }

    public static void main(String[] args) {
        solution("abdef");
        solution("abde");
    }

}