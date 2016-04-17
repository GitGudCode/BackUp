package taskFive;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ExtractWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputTxt = scanner.nextLine();
        scanner.close();
        String wordsPattern = "[a-zA-z]+";
        Pattern pattern = Pattern.compile(wordsPattern);
        Matcher matcher = pattern.matcher(inputTxt); // Apperantly it cant work with String[] thats split.
        while (matcher.find()){
            System.out.print(matcher.group() + " ");
        }

    }
}
