//Saving code, Im pretty sure it will be part of task in exam.

package taskTwo;
import java.util.Scanner;
public class SequencesOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" "); // Neat.
        scanner.close();
        String previous = "";
        String current = "";
        for(int i = 0; i < array.length; i++){
            if(i == 0){
                System.out.print(array[i] + " ");
                continue; // Spent an hour trying to figure this out. Without it the program just skips the rest of the code.
            }
            previous = array[i - 1];
            current = array[i];
            if(current.contains(previous)){
                System.out.print(current + " ");
            }
            else {
                System.out.println();
                System.out.print(current + " ");
            }
        }
    }
}
