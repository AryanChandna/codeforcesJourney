import java.util.Scanner;

public class physicist {
 
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int rows = n;
        int cols = 3;

        int[][] matrix = new int[rows][cols];

        scanner.nextLine(); 

        for (int i = 0; i < rows; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(tokens[j]);
            }
        }

        processMatrix(matrix, rows, cols);


    }

    private static void processMatrix(int[][] matrix, int rows, int cols) {
        
        
        int xSum = 0;
        int ySum = 0;
        int zSum = 0;
        
        for(int i=0; i<rows; i++){
            xSum += matrix[i][0];
            ySum += matrix[i][1];
            zSum += matrix[i][2];
        }

        if(xSum == 0 && ySum == 0 && zSum == 0)
            System.out.println("YES");
        else{
            System.out.println("NO");
        }
    }
}
