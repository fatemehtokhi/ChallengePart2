import java.util.Scanner;

public class GettMidChar {
    public static String middle(String str) {
        int i, length;
        if (str.length() % 2 == 0) {
            i = str.length() / 2 - 1;
            length = 2;
        } else {
            i = str.length() / 2;
            length = 1;
        }
        return str.substring(i, i + length);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a String: ");
        String str = input.nextLine();
        System.out.println("The Middle Character in the string:" + middle(str));

    }

}