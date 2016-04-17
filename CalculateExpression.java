/**
 * Created by gamin on 3/21/2016.
 */
import java.util.Scanner;
public class CalculateExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        if (a >= 0 & b >= 0 & c >= 0) {
            double f1 = (Math.pow((a * a + b * b) / (a * a - b * b), (( a +  b + c)/ Math.sqrt(c))));
            double f2 = (Math.pow((a * a  +  b * b  - c * c * c),(a - b)));

            double averageSimple = ((a + b + c) / 3);
            double averageFormulae = ((f1 + f2)/ 2);
            double difference = Math.abs(averageSimple - averageFormulae);

            System.out.printf("F1 Result %.2f; ", f1);
            System.out.printf("F2 Result %.2f; ", f2);
            System.out.printf("Difference Result %.2f; ", difference);
        }
    }
}
