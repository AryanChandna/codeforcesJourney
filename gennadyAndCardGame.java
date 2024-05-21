import java.util.Scanner;

public class gennadyAndCardGame {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        String tableCard = scanner.next();
        char tableRank = tableCard.charAt(0);
        char tableSuit = tableCard.charAt(1);
        
        boolean canPlay = false;
        for (int i = 0; i < 5; i++) {
            String handCard = scanner.next();
            char handRank = handCard.charAt(0);
            char handSuit = handCard.charAt(1);
            
            if (handRank == tableRank || handSuit == tableSuit) {
                canPlay = true;
                break;
            }
        }
        
        if (canPlay) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
    
}
