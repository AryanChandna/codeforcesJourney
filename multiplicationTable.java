import java.util.Scanner;

public class multiplicationTable {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int counter = 0;

        for(int i = 1; i <=n; i++){

            if(x % i == 0 && x / i <= n){

                counter++;
            }
        }

        System.out.println(counter);
        
    }
}
