import java.util.Scanner;

public class chatRoom {
    
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String hello = "hello";
        int j = 0;
        int counter = 0;
        for(int i = 0; i < input.length(); i++){

            if(counter == 5)
                break;

            else if(input.charAt(i) == hello.charAt(j)){
                counter++;
                j++;
            }
        }

        if(counter == 5)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
