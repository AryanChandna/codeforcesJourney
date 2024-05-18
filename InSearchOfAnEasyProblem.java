import java.util.Scanner;

public class InSearchOfAnEasyProblem {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] peopleAsked = new int[t];
        for(int i = 0; i < peopleAsked.length; i++){

            peopleAsked[i] = scanner.nextInt();
        }

        boolean isHard = false;
        for(int i = 0; i < peopleAsked.length; i++){
            if(peopleAsked[i] == 1){
                isHard = true;
                break;
            }

        }

        if(isHard){
            System.out.println("HARD");
        }
        else{
            System.out.println("EASY");
        }
    }
}
