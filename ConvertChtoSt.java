import java.util.Scanner;

public class ConvertChtoSt {
    public void charToSt(char c) {
        String st = Character.toString(c);

    }

    public static void main(String[] args) {
        System.out.println("Please Enter charaters:");
        Scanner input = new Scanner(System.in);
        String ch = input.next();
        System.out.println(ch);
    }

}