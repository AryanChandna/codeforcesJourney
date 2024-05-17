import java.util.Scanner;

public class antonAndPolyhedrons {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        int sumOfFaces = 0;
        while(t -- > 0){
        String hedronName = scanner.next();
        sumOfFaces += countFacesOfHedron(hedronName);
        }

        System.out.println(sumOfFaces);
        
    }

    private static int countFacesOfHedron(String hedronName) {
        if(hedronName.startsWith("I"))
            return 20;
        else if(hedronName.startsWith("C"))
            return 6;
        else if(hedronName.startsWith("T"))
            return 4;
        else if(hedronName.startsWith("D"))
            return 12;
        else 
            return 8;

    }
}
