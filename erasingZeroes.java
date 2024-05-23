import java.util.Scanner;

public class erasingZeroes {
   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while(t-- > 0){

            String input = scanner.next();

            processInput(input);
        }
    }

    private static void processInput(String input) {
        
        int counter = 0;
        int start = -1;
        int last = -1;
        for(int i = 0; i < input.length(); i++){

            if(input.charAt(i) == '1'){
                if(start == -1)
                    start = i;
            
            last = i;
            }

        }

        for(int i = start; i < last; i++){

            if(input.charAt(i) == '0')
                counter++;
        }

        System.out.println(counter);
    }
}  
