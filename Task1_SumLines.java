package taskOne;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task1_SumLines {
    public static void main(String[] args) {
    File fail = new File("C:\\Users\\gamin\\JavaFundamentals\\JavaFlows\\src\\taskOne\\lines.txt.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(fail),
                2048)){

             String line;
             int lineCharsSum;
             while ((line = reader.readLine()) != null) {
                lineCharsSum = line.chars().sum();System.out.format("%d%n", lineCharsSum);
            }

    } catch (IOException e) {
            System.out.println("Kopka me kopa me kopka, dali e kopka ili e ... KLOPKA!"); // Malko Mile Kitic
        }
    }
}
