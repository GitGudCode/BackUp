/**
 * Created by gamin on 3/22/2016.
 */
import java.util.Scanner;
import java.util.Locale;
public class FormatNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        String column = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("|%-10x|", a);
        System.out.printf("|%10s|", column);
        System.out.printf("|%10.2f|", b);
        System.out.printf("%-10.3f|", c);
    }
}
