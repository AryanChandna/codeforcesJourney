import java.util.Scanner;

public class softDrink {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int l = scn.nextInt();

        int c = scn.nextInt();
        int d = scn.nextInt();
        int p = scn.nextInt();
        int nl = scn.nextInt();
        int np = scn.nextInt();

        int toastsByDrink = (k * l) / nl;
        int toastsByLime = c * d;
        int toastsBySalt = p / np;
        
        int minToasts = Math.min(toastsByDrink, Math.min(toastsByLime, toastsBySalt)) / n;
        System.out.println(minToasts);
    }
}
