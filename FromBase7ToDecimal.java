/**
 * Created by gamin on 3/21/2016.
 */ import java.util.Scanner;
public class FromBase7ToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String baseSeven = scanner.next();
        Integer decimalBase = Integer.valueOf(baseSeven, 7);
        System.out.println(decimalBase);
    }
}
