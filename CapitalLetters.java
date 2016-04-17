package taskSix;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputTxt = scanner.nextLine().split("[ ]+");
         scanner.close();
         String pattern0 = "[A-Z][A-Z]";
         String pattern1 = "[A-Z][a-z]+[A-Z]";
         String pattern2 = "[A-Z][a-z]+[A-Z][a-z]+[A-Z]";
         Pattern patrn = Pattern.compile(pattern0);
         for (int i = 0; i < inputTxt.length; i++) {
             String currentElemnt = inputTxt[i];
             Matcher match = patrn.matcher(currentElemnt);
             if (match.find()) {
                 System.out.print(match.group() + " ");

            }

        }
         patrn = Pattern.compile(pattern1);
         for (int i = 0; i < inputTxt.length; i++) {
             String currentElemnt = inputTxt[i];
             Matcher match = patrn.matcher(currentElemnt);
             if (match.find()) {
                 if (currentElemnt.length() == match.group().length()) {
                     System.out.print(match.group() + " ");

                }

            }

        }
         patrn = Pattern.compile(pattern2);
         for (int i = 0; i < inputTxt.length; i++) {
             String currentElemnt = inputTxt[i];
             Matcher match = patrn.matcher(currentElemnt);
             if (match.find()) {
                 System.out.print(match.group() + " ");

            }

        }

    }
}
