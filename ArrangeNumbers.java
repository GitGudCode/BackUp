package ArrangeNumbersTest;


import java.util.Scanner;
public class ArrangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        String[] digits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        StringBuilder arranger = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            arranger.append(digits[Integer.parseInt(input.toString().substring(i, i + 1))]);

        }
        System.out.println(arranger.toString());
    }
}
