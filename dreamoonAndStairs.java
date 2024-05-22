import java.util.Scanner;

public class dreamoonAndStairs {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int result = 0;
        int nDivided;

        if(n % 2 != 0){

            nDivided = n /2;
            nDivided++;
        }
        else
            nDivided = n/2;

        for(int i = nDivided; i <= n; i++) {

            if(i % m == 0){

                result = i;
                break;
            }
        }

        if(result > 0)
            System.out.println(result);
        else
            System.out.println(-1);
        
    }
}
