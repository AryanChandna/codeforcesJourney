import java.util.Scanner;

public class helpfulMaths {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String sumToCheck = scanner.nextLine();

        char[]charOfNumbers = sumToCheck.toCharArray();

        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < charOfNumbers.length; i = i + 2){

            if(charOfNumbers[i] == '1'){
                answer.append(charOfNumbers[i]);
                answer.append("+");
        }
        
    }
    for(int i = 0; i < charOfNumbers.length; i = i + 2){

        if(charOfNumbers[i] == '2'){
            answer.append(charOfNumbers[i]);
            answer.append("+");
    }
}

    for(int i = 0; i < charOfNumbers.length; i = i + 2){

        if(charOfNumbers[i] == '3'){
            answer.append(charOfNumbers[i]);
            answer.append("+");
    }

    }
    answer.deleteCharAt(answer.length()-1);
    System.out.println(answer);
    
}
}
