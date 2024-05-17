import java.util.Arrays;
import java.util.Scanner;

public class newYearMeetingFriends {
    public static void main (String[]args){

        Scanner scn = new Scanner(System.in);
        int[] arr = new int[3];

        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        Arrays.sort(arr);
        
        //closest to the middle one
        int ans = (arr[2] - arr[1]) + (arr[1] - arr[0]);
        System.out.println(ans);
    }
}
