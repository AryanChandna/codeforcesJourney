import java.util.Scanner;

public class wordCapitalization {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String wordToCapitalize = scanner.nextLine();

        String ans = wordToCapitalize.substring(0,1).toUpperCase() + wordToCapitalize.substring(1);
        System.out.println(ans);

    }
    
}
