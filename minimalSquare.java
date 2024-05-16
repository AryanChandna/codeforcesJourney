import java.util.Scanner;

public class minimalSquare{

    public static void main(String[]args){

        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while(t-- > 0){

            int length = scn.nextInt();
            int breadth = scn.nextInt();

            minimumSquareArea(length, breadth);
        }

    }

    private static void minimumSquareArea(int length, int breadth) {
        
        int areaOfRectangles = (length * breadth) * 2;
        int ans = 0;

        if(length == 1 || breadth == 1){
            ans = Math.max(length, breadth);
            System.out.println(ans * ans);
        }

        else{
           
            int checkForPerfectSquare = Math.max(length, breadth);
            checkForPerfectSquare = checkForPerfectSquare * checkForPerfectSquare;

            if(checkForPerfectSquare == areaOfRectangles){
                System.out.println(checkForPerfectSquare);
            }
            else{
            ans = (int) Math.sqrt(areaOfRectangles);
            ans = ans + 1;
            System.out.println(ans * ans);
            }
        }
    }
}