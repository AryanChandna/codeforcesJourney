import java.util.Scanner;

public class wrongSubtraction {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int timesOfSubtraction = scanner.nextInt();

        while(timesOfSubtraction-- > 0){

            int digit = number % 10;
            if(digit == 0){
                number = number / 10;
            }
            else
                number = number - 1;
        }
        System.out.println(number);

    }
    
}
