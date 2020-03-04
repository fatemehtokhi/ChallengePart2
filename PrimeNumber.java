import java.util.Scanner;

public class PrimeNumber{
    public static boolean pNumber(int n){
        if(n<=0)
            return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
            return false;
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner num = new Scanner(System.in);
        int prim =num.nextInt();
        System.out.println(pNumber(prim));
        
    }



    }
