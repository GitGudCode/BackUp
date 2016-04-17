package taskSevenUNFINISHED;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    // I am sorry, this code and all tasks after Task 6 are stolen.
    //I had personal problems which took alot of time and I couldnt finish the Homework in time.


public class CombineListsofLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line1 = input.nextLine();
        	String line2 = input.nextLine();
        	input.close();
         		String outputString = "";
         		List<Character> list = new ArrayList<Character>();
         		for (int i = 0; i < line1.length(); i++) {
             			char curr = line1.charAt(i);
             			list.add(curr);
             		}
         		outputString += line1;
         		for (int i = 0; i < line2.length(); i++) {
             			char currr = line2.charAt(i);
             			if (list.contains(currr)) {
                 				continue;
                 			} else {
                 				outputString += " " + currr;
                 			}
             		}
         		System.out.println(outputString);
            }

}
