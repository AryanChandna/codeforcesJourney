import java.util.Scanner;

public class maximumIncrease {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int numberOfIntegers = scanner.nextInt();
        int[] numbers = new int[numberOfIntegers];

        for(int i = 0; i < numbers.length; i++){

            numbers[i] = scanner.nextInt();
        }

        if(numbers.length == 0) {
            System.out.println(0);
        }
        int currentLength = 1;
        int maxLength = 1;

        for(int i = 1; i < numbers.length; i++){

            if(numbers[i] > numbers[i-1]){
                currentLength++;
            }else{
                maxLength = Math.max(currentLength, maxLength);
                currentLength = 1;
            }
        }

        maxLength = Math.max(currentLength, maxLength);
        System.out.println(maxLength);
    }
    
}
