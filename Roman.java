
public class Roman {
        public static String intToRoman(int num) {
            int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
            StringBuilder result = new StringBuilder();
    
            for (int i = 0; i < values.length; i++) {
                while (num >= values[i]) {
                    num -= values[i];
                    result.append(numerals[i]);
                }
            }  
            return result.toString();
        }

        public static void main(String[] args) {

            System.out.println("This number is = "+ 500 +" and the Roman its is ="+intToRoman(500));

        }


}