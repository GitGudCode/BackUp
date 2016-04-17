package taskThree;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputTxt = scanner.nextLine().toLowerCase().split("[ :,.')(!@#$]+"); // Split by nonletter.
        String targetWord = scanner.nextLine();
         	scanner.close();
         	int countMatches = 0;
         	for (int i = 0; i < inputTxt.length; i++) {
             		String currentElement = inputTxt[i];
             		if (targetWord.equals(currentElement)) {
                 			countMatches++;
                 		}
             	}
         	System.out.println(countMatches);


    }
}
