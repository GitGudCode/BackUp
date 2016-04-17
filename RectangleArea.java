/**
 * Created by gamin on 3/17/2016.
 */
import java.util.Scanner;
public class RectangleArea {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int width = scanner.nextInt();
        int area = (height * width);
        System.out.println(area);
    }
}
