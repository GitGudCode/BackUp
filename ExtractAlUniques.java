package taskEightUNFINISHED;
import java.util.ArrayList;
 import java.util.Collections;
 import java.util.List;
 import java.util.Scanner;

// I am sorry, this code and all tasks after Task 6 are stolen.
//I had personal problems which took alot of time and I couldnt finish the Homework in time.

public class ExtractAlUniques {
    public static void main(String[] args) {
        		Scanner scan = new Scanner(System.in);
        		String[] input = scan.nextLine().toLowerCase().split("[ .?:]+");
         		scan.close();
         		List<String> inputLines = new ArrayList<String>();
        		for (int i = 0; i < input.length; i++) {
            		String current = input[i];
            		if (!inputLines.contains(current)) {
                			inputLines.add(current);
                			}
                }
        	Collections.sort(inputLines);
        	//!!!!	Of the first test are wrong output because the letter 's' is before 't'  !!!!!
         //           and output must be => java softuni to welcome
        for (String word : inputLines) {
            			System.out.print(word + " ");
            		}

        	}
     }


