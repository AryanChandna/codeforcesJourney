import java.util.ArrayList;
import java.util.Scanner;

public class numbersOnWhiteboard {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();

        while(numberOfTestCases-- > 0){

            int numberUpto = scanner.nextInt();

            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            for(int i = 1; i <= numberUpto; i++){
                arrayList.add(i);
            }

            ArrayList<Integer> resultSet = processForBreakdown(arrayList);
            
            for(int i = 0; i < resultSet.size(); i=i+2){

                if(i + 1 < resultSet.size()){
                System.out.println(resultSet.get(i) + " " + resultSet.get(i+1));
                }
            }
        }
    }

    private static ArrayList<Integer> processForBreakdown(ArrayList<Integer> arrayList) {
       ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = arrayList.size() - 1; i >= 0; i--){

            if(arrayList.size() == 1)
                break;

            double newNumber = Math.ceil(arrayList.get(i) + arrayList.get(i-1)) / 2;
            int ceilResult = (int) Math.ceil(newNumber);
            result.add(arrayList.get(i));
            result.add(arrayList.get(i-1));
            arrayList.remove(i);
            arrayList.remove(i-1);
            arrayList.add(ceilResult);

        }

        System.out.println(arrayList.get(0));
        return result;
    }
}
