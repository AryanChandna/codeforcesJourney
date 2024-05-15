import java.util.Arrays;
import java.util.Scanner;

public class MinumumVariedNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 

        while (t-- > 0) {
            int n = scanner.nextInt(); 
            solveForN(n);

        }

        scanner.close();
    }

    private static void solveForN(int n) {

        StringBuilder number = new StringBuilder();

            for (int digit = 9; digit > 0; digit--) {
                if (n >= digit) {
                    number.append(digit);
                    n -= digit;
                }
            }

            char[] digits = number.toString().toCharArray();
            for(int i = 0; i < digits.length; i++) {}
            Arrays.sort(digits);

        System.out.println(digits);
    }
}
