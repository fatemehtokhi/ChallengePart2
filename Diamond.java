import java.util.Scanner;

public class Diamond{
    public static String print(int n){
        String s = String.valueOf(n);
        for(int i=0;i<n;i++){
            System.out.println("*");
            for(int j=0;j<n;j++){
                System.out.println("*");
            }
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println("Please Enter a number:");
        Scanner scan =new Scanner(System.in);
        int rows = scan.nextInt();
        System.out.println(print(rows));
        
    }
}