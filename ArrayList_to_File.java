package TaskFive;

import java.io.*;
 import java.util.ArrayList;
 import java.util.Collections;
 import java.util.List;
 import java.util.Random;

// Code not entirely mine, and not working I am sorry. I have no time to finish it i have to do the next assignment :( .
public class _5_Save_an_ArrayList_of_doubles {


    private static final String DATA_FILE = "resources/doubles.list";

    public static void main(String[] args) {
                 List<Double> arrList = new ArrayList();
                 Random rand = new Random();


                 System.out.println("Generating five random doubles:");
                 for (int i = 0; i < 5; i++) {
                         arrList.add(rand.nextDouble());
                     }
                 arrList.forEach(System.out::println);


                 System.out.println("Saving current state...");
                 saveList(arrList);


                 System.out.println("Sorted:");
                 Collections.sort(arrList);
                 arrList.forEach(System.out::println);


                 System.out.println("Loading previous state...");
                 arrList = loadList();
                 arrList.forEach(System.out::println);
             }


    private static void saveList(List<Double> a) {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new BufferedOutputStream(
                new FileOutputStream(DATA_FILE)))) {
            //            a.forEach(oos::writeDouble);
            for (Double aDouble : a) {
                oos.writeDouble(aDouble);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static List<Double> loadList() {
        List<Double> local = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(
                new BufferedInputStream(
                new FileInputStream(DATA_FILE)))) {


                         while (true) {
                                 try {
                                         double d = ois.readDouble();
                                         local.add(d);
                                     } catch (EOFException exc) {
                                         ois.close();
                                         break;
                                     }


        } catch (Exception e) {
                         e.printStackTrace();
                     }
        return local;
    }
}
