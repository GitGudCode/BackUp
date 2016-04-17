package taskTwo;

import java.util.Scanner;
import java.util.Arrays;
public class SortWithStreamAPI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] input = scan.nextLine().split("\\s+");
        String order = scan.nextLine();

        if(order.equals("Ascending")){
            Arrays.stream(input).map(x -> Integer.parseInt(x)).sorted().forEach(x -> System.out.printf("%x", x));
        } else {
            Arrays.stream(input).map(y -> Integer.parseInt(y)).sorted((y1,y2) -> y2.compareTo(y1)).forEach(y -> System.out.printf("%y", y));
        }
    }
}
