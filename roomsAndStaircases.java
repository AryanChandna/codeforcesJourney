import java.util.Scanner;

public class roomsAndStaircases{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while(t-- > 0){

            int numberOfRooms = scanner.nextInt();
            String stairsInRooms = scanner.next();

            maximumNumberOfRoomsInTour(numberOfRooms, stairsInRooms);
        }
    }

    private static void maximumNumberOfRoomsInTour(int numberOfRooms, String stairsInRooms) {

        int counter = 1;
        int lastOne = 0;
        for(int i = 0; i < stairsInRooms.length(); i++){

            if(stairsInRooms.charAt(i) == '1'){
                lastOne = i;
            }

        }

        for(int i = 1; i <= lastOne; i++){

            counter++;
        }

        counter++;
        counter += ((numberOfRooms) * 2) - counter; 
        System.out.println(counter);
    }
}