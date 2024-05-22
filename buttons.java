import java.util.Scanner;

public class buttons {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int result = input;

        for(int i = 1; i < input; i++){

            result += (input - i) * i;
        }

        System.out.println(result);

    }  
    
}
