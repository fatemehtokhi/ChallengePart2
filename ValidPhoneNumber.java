import java.util.Scanner;

public class ValidPhoneNumber{
    public static Boolean validNumber(String str){
    return str.matches("\\(\\d{3}\\)\\d{3}-\\d{4}");

    }
     public static void main(String[] args) {
         System.out.println("Please Enter PhoneNumber");
         Scanner sc =new Scanner(System.in);
         String PNumber = sc.nextLine();
         System.out.println(validNumber(PNumber));
        
    }
}