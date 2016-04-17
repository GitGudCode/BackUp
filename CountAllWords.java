package taskFour;

import java.util.Scanner;
public class CountAllWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[]inputTxt = scanner.nextLine().toLowerCase().split("[ :,.')-_(!@#$]+"); // No need for pattern matcher.
        scanner.close(); // If not closed does it cause memory leaks?
        int result = inputTxt.length;
        System.out.println(result);
    }
}
