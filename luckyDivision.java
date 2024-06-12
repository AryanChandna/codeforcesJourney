import java.util.Scanner;

public class luckyDivision {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = {4,7,44,47,74,77,444,447,474,477,744,747,777};
        boolean flag = false;
        for(int i = 0; i < arr.length; i++){

            if(n % arr[i] == 0)
                flag = true;
        }

        if(flag)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
