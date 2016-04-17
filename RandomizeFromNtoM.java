/**
 * Created by gamin on 3/21/2016.
 */
// Pretty sure it can be done with API Random Method but I dont know how yet.
// I did lose ~2 hours trying with it. This is not randomizing, this is simply reshuffling.
import java.util.Scanner;
import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;
public class RandomizeFromNtoM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int start = Math.min(N, M);
        int end = Math.max(N, M);

        ArrayList<Integer> numbersList = new ArrayList<Integer>();
        for ( int i = start, j = 0; i <= end; i++, j++){
            numbersList.add(i);
        }
        Collections.shuffle(numbersList);
        System.out.print(numbersList.toString());
        }
    }

