package taskONE;

import java.util.Arrays;
import java.util.Scanner;
public class FilterArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] text = scan.nextLine().split(" ");
        Arrays.stream(text).filter(t -> t.length() > 3).forEach(t -> System.out.printf("%s ", t));

       }
    }
