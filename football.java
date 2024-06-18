import java.util.Scanner;

public class football {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int goalCountA = 0;        
        int goalCountB = 0;        
        String teamA = null;
        String teamB = null;


        while(n-- > 0){

            String teamName = scanner.nextLine().trim();
            if(teamA == null || teamName.equalsIgnoreCase(teamA)){
                teamA = teamName;
                goalCountA++;
            }
            else if(teamB == null || teamName.equalsIgnoreCase(teamB)){
                teamB = teamName;
                goalCountB++;
            }
        }

        String winningTeam = goalCountA > goalCountB ? teamA : teamB;
        System.out.println(winningTeam);


    }
    
}
