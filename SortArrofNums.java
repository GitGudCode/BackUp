package taskOne;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
public class SortArrofNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number n: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i <= numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();


        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int curr = numbers[i];
                int next = numbers[j];
                int temp = numbers[i];
                if (curr > next) {
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
    for(i = 0; i < numbers.length; i++){
    System.out.print( numbers[i] + " ");
}


        }
    }
}

