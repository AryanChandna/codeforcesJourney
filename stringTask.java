import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class stringTask {
    public static void main(String[] args){

        Set<Character> charsToRemove = Set.of('A', 'O', 'Y', 'E', 'I','U', 'a','e','i','o','u','y');

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        String filteredString = inputString.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> !charsToRemove.contains(c))
                .map(String::valueOf)
                .collect(Collectors.joining());

        char[] charArray = filteredString.toCharArray();

        for(int i = 0; i < charArray.length; i++){
            if(charArray[i] >= 97 && charArray[i] <= 122)
                continue;
            else
                charArray[i] = (char) (charArray[i] + 32);
        }
    
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < charArray.length; i++){
            result.append(".");
            result.append(charArray[i]);
        }
        System.out.println(result.toString());
    }
    }

