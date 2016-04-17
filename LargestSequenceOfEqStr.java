package taskThree;


import java.util.Scanner;
public class LargestSequenceOfEqStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" "); // Neat.
        scanner.close();
        String previous = "";
        String current = "";
        int max = 0;
        int lengthofStr = 0;
        int endPoint = 0;
        for (int i = 0; i < array.length; i++){
            if (i == 0){
                lengthofStr++;
                continue;
            }
            previous = array[i - 1];
            current = array[i];
            if(current.contains(previous)){
                lengthofStr++;
                if(lengthofStr > max) {
                    max = lengthofStr; // careful with the order here.
                    endPoint = i;
                }
                } else {
                    if (lengthofStr > max){
                        max = lengthofStr;
                        lengthofStr = 1;
                        endPoint = i;
                    } else {
                        lengthofStr = 1;
                    }
                }
            }
            if(max == 1 || max == 0){
                System.out.println(array[0] + " ");
            } else {
                for(int i = 0; i < max; i++){
                    System.out.print(array[endPoint--] + " " );
                }
            }
        }
    }

