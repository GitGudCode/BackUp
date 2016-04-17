package taskOne;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputText = scan.nextLine();
        scan.close();
        Pattern pattern = Pattern.compile("[a-z.-_@a-z.a-z.a-z]+");//Not sure where capitals come into play, it doesnt get them in RegExr.
        Matcher matcher = pattern.matcher(inputText);
        while (matcher.find()){
            if (matcher.group().length() == 1){
                continue;
            }
            if (matcher.group().contains("@")){
                System.out.println(matcher.group());
            }
        }

    }

}
