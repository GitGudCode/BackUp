package taskFive;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern; // This shit right here!
public class AllWords {
    public static void main(String[] args) {
        System.out.println("After input, plase press Enter twice.");
        Scanner scan = new Scanner(System.in);
        int numOfWords = 0;
        String text;
        while (true){
            text = scan.nextLine();
            if(text.isEmpty()){
                break;
            }
            String template = "[a-zA-z]+";
            Pattern patttern = Pattern.compile(template);
            Matcher matcher = patttern.matcher(text);
            while (matcher.find()){
                numOfWords++;
            }
        }
        System.out.print(numOfWords);
        scan.close();
    }
}
