import java.util.Scanner;

public class ciphers {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String encryptedString = scanner.next();

        StringBuilder ans = new StringBuilder();
        int j = 2;
        for(int i = 0; i < t;){

            System.out.print(encryptedString.charAt(i));
            i = i + j;
            j++;

        }

    }
}
