import java.util.Scanner;

public class arrivalOfGeneral {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        int[] soldierArray = new int[t];

        for(int i=0; i<t; i++) {

            soldierArray[i] = scanner.nextInt(); 
        }

        arrangeSoldiers(soldierArray);
    }

    private static void arrangeSoldiers(int[] soldierArray) {
       
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int largest: soldierArray) {
            if(largest > max) max = largest;
        }

        for(int smallest: soldierArray) {
            if(smallest < min) max = smallest;
        }

        int largestIndex = 0;
        for(int i = 0; i < soldierArray.length; i++) {

            if(soldierArray[i] == max){
                largestIndex = i;
                break;
            }
        }

        int smallIndex = 0;
        for(int i = 0; i < soldierArray.length; i++) {

            if(soldierArray[i] == min){
                smallIndex = i;
            }
        }

        int secondsToArrange = 0;

        for(int i = 0; i < soldierArray.length; i++) {

            

        }
        

    }
}
