import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TurtleFast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        List<Integer> outputs = new ArrayList<>();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            int sum = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
                sum += arr[i];
            }

            int remainder = sum % 3;
            int moves;

            if (remainder == 0) {
                moves = 0;
            } else if (remainder == 1) {
                int count = 0;
                for (int num : arr) {
                    if (num % 3 == 1) {
                        count++;
                    }
                }
                if (count > 0) {
                    moves = 1;
                } else {
                    moves = 2;
                }
            } else {
                moves = 1;
            }

            outputs.add(moves);
        }

        // Print all outputs
        for (int move : outputs) {
            System.out.println(move);
        }
    }
}
