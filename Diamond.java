import java.util.Scanner;

public class Diamond {
    public static String print(int n) {
        String s = String.valueOf(n);
        for (int i = 0; i <n; i++) {
            for (int j = n-i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0 ; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1 ; j<=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        return s;
    }

    public static void main(String[] args) {
        System.out.println("Please Enter a number:");
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        System.out.println(print(rows));

    }
}