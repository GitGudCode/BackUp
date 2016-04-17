package taskTwo;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class CountSubstrinOcc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine().toLowerCase();
        String subStr = scanner.nextLine();
        int occurence = 0;
        int sizeSub = subStr.length();
        //Pattern pattern =
        for(int i = 0; i < inputStr.length() - sizeSub; i++){
            if(subStr.equals(inputStr.substring(i, sizeSub + i))){
                occurence++;
            }
        }
        System.out.println(occurence);
    }
}
