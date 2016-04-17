/**
 * Created by gamin on 3/21/2016.
 */
import java.util.Scanner;
public class DecimalToBase7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimalBase = scanner.nextInt();
        String baseSeven = Integer.toString(decimalBase, 7);
        System.out.println(baseSeven);
    }
}
