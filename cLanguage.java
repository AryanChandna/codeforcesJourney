import java.util.Scanner;

public class cLanguage {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 
        
        while (t-- > 0) {
            int a = scanner.nextInt(); 
            int b = scanner.nextInt(); 
            int n = scanner.nextInt(); 
            
            int count = 0;
            
            while (Math.max(a, b) <= n) {
                count++;
                if (a < b) {
                    a += b;
                } else {
                    b += a;
                }
            }
            
            System.out.println(count);
        }
    }
}