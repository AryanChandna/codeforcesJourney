import java.util.Scanner;

public class beatTheOdds {
    
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while(t-- > 0){

            int n = scanner.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = scanner.nextInt();
            }

            processArrayForEvenSum(arr);
        }
    }

    private static void processArrayForEvenSum(int[] arr) {

        int evenCount = 0;
        int oddCount = 0;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] % 2 == 0) 
                evenCount++;
            else
                oddCount++;
        }

        System.out.println(Math.min(evenCount, oddCount));
    }
}
