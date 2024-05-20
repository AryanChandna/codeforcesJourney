import java.util.Scanner;

public class petrAndBook {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        int pagesOfBook = scanner.nextInt();

        int t = 7;
        int[] arrOfPagesPerDay = new int[t];


        for(int i = 0; i < arrOfPagesPerDay.length; i++){

            arrOfPagesPerDay[i] = scanner.nextInt();

        }

        ansForPetr(arrOfPagesPerDay, pagesOfBook);

    }

    private static void ansForPetr(int[] arrOfPagesPerDay, int pagesOfBook) {
    

        int i = 0;
        while(pagesOfBook > 0){

            pagesOfBook -= arrOfPagesPerDay[i];
            i++;
            if(i >= 7) 
                i = 0;

        }

        System.out.println((i == 0) ? 7 : i); 
    }

    }

