/**
 * Created by gamin on 3/21/2016.
 */
import java.util.Scanner;
public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strArr = scanner.nextLine().split(" ");
        int sum = getCharCodeSum(strArr[0],strArr[1]);
        System.out.println(sum);

    }

    private static int getCharCodeSum(String string1, String string2) {
        int sum = 0;
        int longerString = Math.max(string1.length(), string2.length());
        for (int i = 0; i <= longerString; i++){
            int codeOne = 1;
            int codeTwo = 1;

            if(i < string1.length()){
                codeOne = string1.charAt(i);
            }
            if(i < string2.length()){
                codeTwo = string2.charAt(i);
            }
            sum += codeOne * codeTwo;
        }
            return sum;
    }
}
