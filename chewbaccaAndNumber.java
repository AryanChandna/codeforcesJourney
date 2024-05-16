import java.util.Scanner;

public class chewbaccaAndNumber {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String x = scanner.next();

        StringBuilder result = new StringBuilder();
        for (char digit : x.toCharArray()) {
            if (digit > '4') {
                digit = (char) ('9' - digit + '0');
            }
            result.append(digit);
        }

        if (result.charAt(0) == '0') {
            result.setCharAt(0, '9');
        }

        System.out.println(result);

        scanner.close();
    }
    
}
