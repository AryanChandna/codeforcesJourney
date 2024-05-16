import java.util.Scanner;

public class yogurtSale {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while(t-- > 0){
            int n = scn.nextInt();
            int a = scn.nextInt();
            int b = scn.nextInt();

            solveForBurles(n, a, b);
        }
    }

    private static void solveForBurles(int n, int a, int b) {
        
       int individualCost = n * a;
       int promotionalCost = (n/2) * b + (n % 2) * a;

       int ans = Math.min(individualCost,promotionalCost);
       System.out.println(ans);


    }
}
