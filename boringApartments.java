import java.util.Scanner;

public class boringApartments {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while(t-- > 0){

            String apartmentAnswered = scanner.next();

            checkDigits(apartmentAnswered);
        }
    }

    private static void checkDigits(String apartmentAnswered) {

        int c = apartmentAnswered.charAt(0) - '0';
        int length = apartmentAnswered.length();
        
        int result = ((c - 1) * 10 ) + (length * (length + 1)) / 2;

        System.out.println(result);

    }
}
