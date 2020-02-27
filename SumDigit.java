import java.util.Scanner;

public class SumDigit{
    
    public static int nRoot(int n){
        int sum=0;
        while (n > 0) {
            sum = sum + n % 10;
            n= n / 10;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        System.out.println("please enter a number");
        Scanner sc = new Scanner(System.in);
        int number =sc.nextInt();
        System.out.println(nRoot(number));
        
    }
}