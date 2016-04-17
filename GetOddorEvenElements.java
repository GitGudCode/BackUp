/**
 * Created by gamin on 3/22/2016.
 */
// Getting exception :(
import java.util.Scanner;
public class GetOddorEvenElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbersString = scanner.next().split(" ");
        String[] input = scanner.next().split(" ");
        int digit = Integer.parseInt(input[1]);
        String oddEven = input[2];

        int[] numbers = new int[numbersString.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersString[i]);
        }
        if (oddEven.equals("odd")) {
            printNumbers(numbers, digit, 1);
        } else {
            printNumbers(numbers, digit, 0);
        }
    }


    private static void printNumbers(int[] numbers, int digit, int evenOdd) {
        for (int i = 0; i < numbers.length; i++) {

            if (digit == 0) {
                break;
            }
            if (numbers[i] % 2 == evenOdd) {
                digit--;
                System.out.print(numbers[i] + " ");
            }
        }
    }
}



