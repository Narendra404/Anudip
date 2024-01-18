package streams.readAndWrite;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {

//      To find the path of the working directory.
//      System.out.println(System.getProperty("user.dir"));
        File file;
        FileReader source = null;
        try {
            file = new File("aw.txt");
            source = new FileReader(file);
            int c;
            while ((c = source.read()) != -1) {
                System.out.println((char) c);
            }
        } catch (IOException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        } finally {
            if (source != null) {
                try {
                    source.close();
                } catch (IOException e) {
                    System.out.println(Arrays.toString(e.getStackTrace()));
                }
            }
        }
    }
}
