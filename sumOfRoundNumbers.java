import java.util.Scanner;

public class sumOfRoundNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 

        while (t-- > 0) {
            int n = scanner.nextInt(); 
            processOfSum(n);
        }

        scanner.close();
    }

    private static void processOfSum(int n) {
        int count = 0;
        int temp = n;
            while (temp > 0) {
                int digit = temp % 10;
                if (digit != 0) {
                    count++;
                }
                temp /= 10;
            }

            System.out.println(count);

            int multiplier = 1;
            while (n > 0) {
                int digit = n % 10; 
                if (digit != 0) {
                    System.out.print(digit * multiplier + " "); 
                }
                n /= 10; 
                multiplier *= 10; 
            }

            System.out.println(); 
        }
    }

