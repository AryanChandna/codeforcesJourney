import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        int stepsRequired = 0;
        while (t > 0) {
            if (t >= 5) {
                t = t - 5;
                stepsRequired++;
            } else {
                stepsRequired++;
                break;
            }
        }
        System.out.println(stepsRequired);
        
    }
}
