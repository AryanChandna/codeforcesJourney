import java.util.Scanner;

public class newYearCandles {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int hours = 0;
        hours = a;

        while(a >= b){

            int extra = a / b;
            hours += extra;
            int rem = a % b;
            a = extra + rem;

        }

        System.out.println(hours);
    }
}
