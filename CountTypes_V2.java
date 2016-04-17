package taskThree;

import java.io.*;

//I dont know what made this task so tedious. Took me about 3 hours total and Im not satisfied with the result.

public class CountTypes_V2 {
    static final char[] vowels = {'a', 'e', 'i', 'o', 'u'};
         static final char[] punctuations = {'!', ',', '.', '?'};
         private static final String INPUT_FILE = "taskThree/words.txt";
         private static final String OUTPUT_FILE = "taskThree/count-chars.txt";

    public static void main(String[] args) {
        File words = new File("INPUT_FILE");
        File countChars = new File("OUTPUT_FILE");

        countChars.getParentFile().mkdirs();

        int countVowels = 0;
        int countCons = 0;
        int countPunct = 0;

        try { FileInputStream fileInput = new FileInputStream(words);
            FileWriter writer = new FileWriter(countChars);

            int symbol;
            while ((symbol = fileInput.read()) != -1) {
                if (matches(symbol, vowels)) {
                    countVowels++;
                } else if (matches(symbol, punctuations)){
                    countPunct++;
                } else if (Character.isLetter(symbol)){
                    countCons++;
                }
                }
            writer.write(String.format("Vowels: %d%n", countVowels));
            writer.write(String.format("Consonants: %d%n", countCons));
            writer.write(String.format("Punctuation: %d%n", countPunct));

            fileInput.close();
            writer.close();

        } catch (java.io.IOException e){
            e.printStackTrace();
        }
    }
private static boolean matches (int symbol, char[] chars){
        for (char aChar : chars) {
            if (aChar == symbol){
                return true;
            }
        }
    return false;
}
}
