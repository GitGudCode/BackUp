/**
 * Created by gamin on 3/17/2016.
 */
//
import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
        int aX = scanner.nextInt();
        int aY = scanner.nextInt();
        int bX = scanner.nextInt();
        int bY = scanner.nextInt();
        int cX = scanner.nextInt();
        int cY = scanner.nextInt();


        int area = Math.abs((aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY)) / 2);
         System.out.println(area);

    }
}
