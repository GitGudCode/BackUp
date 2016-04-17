package taskFour;

import java.io.*;
public class Copy_JPG {
    public static void main(String[] args) {
        String path1 = "C:\\Users\\gamin\\Pictures\\Saved Pictures";
        String filename = "MGSV.jpg";
        String path2 = "C:\\Users\\gamin\\JavaFundamentals\\JavaFlows";

        File oldFile = new File(path1, filename);
        File newFile = new File(path2, filename);

        try {
            FileInputStream input = new FileInputStream(oldFile);
            FileOutputStream output = new FileOutputStream(newFile);

            try { int currentByte = input.read();
                while (currentByte != -1){
                    output.write(currentByte);
                    currentByte = input.read();
                }
            }
            catch ( IOException exception){
                System.out.println("An IOException has occured");
                exception.printStackTrace();
            }
                finally {
                input.close();
                    output.close();
                    System.out.println("Copied .jpg");
                }
            }

            catch( IOException exception2 )
            {
                System.err.println( "Problems with files!" );
                exception2.printStackTrace();
            }

        }
}
