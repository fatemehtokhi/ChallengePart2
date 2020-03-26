import java.util.Scanner;

public  class ValueAscci{
    public static int foundValueofChar(char c) {
        char charecter = c;
        int num = (int)charecter;
        return num;
    }
    public static void main(String[] args) {
        System.out.println("Please Enter a Character:");
        Scanner sc = new Scanner(System.in);
        char character  = sc.nextLine().charAt(1);
        foundValueofChar(character);
        
    }    
}