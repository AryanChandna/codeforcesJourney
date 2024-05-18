import java.util.Scanner;

public class bearAndBigBrother {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int limaksWeight = scanner.nextInt();
        int bobsWeight = scanner.nextInt();
        int counter = 0;
        while(bobsWeight >= limaksWeight){

            counter++;
            limaksWeight = limaksWeight * 3;
            bobsWeight = bobsWeight * 2;

        }

        System.out.println(counter);
    }
}


