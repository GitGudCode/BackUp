package taskTwo;


import java.io.*;

public class ALLCAPITALS {
    public static void main(String[] args){
        File document = new File("C:\\Users\\gamin\\JavaFundamentals\\JavaFlows\\src\\taskTwo\\lines.txt.txt");
        File newFile = new File(document + ".tmp");
        newFile.getParentFile().mkdirs();
       try  (BufferedReader reader = new BufferedReader(new FileReader(document), 2048);
           BufferedWriter writer = new BufferedWriter(new FileWriter(document))) {
            String lines;
           String all = "";
           while ((lines = reader.readLine()) != null) {
            lines = lines.toUpperCase();
               all += lines + "\n";
           }
           writer.write(all);
       } catch (IOException e) {
           System.out.println("Catching exception here");
       }
        if (document.delete()){
            newFile.renameTo(document);
        }
    }
}
