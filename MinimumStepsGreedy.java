import java.util.Scanner;

public class MinimumStepsGreedy {
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

        if(n == 1) System.out.println(2);
        else
            System.out.println((n+2)/3);
    }
}
