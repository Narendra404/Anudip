package streams.typeOfFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String dirpath = null;
        String dname = null;
        try {
            System.out.println("Enter dirpath:");
            dirpath = br.readLine();
            // enter any folder name
            System.out.println("Enter the dirname");
            dname = br.readLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // create File object with dirpath and dname
        File f;
        if (dname != null) {
            f = new File(dirpath, dname);
        }
        else {
            throw new NullPointerException("The directory name is null.");
        }
        // if directory exists,then
        if (f.exists()) {
            // get the contents into arr[]
            // now arr[i] represent either a File or Directory
            String[] arr = f.list();
            // find no. of entries in the directory
            int n;
            if (arr != null) {
                n = arr.length;
                // displaying the entries
                for (String s : arr) {
                    // System.out.println(arr[i]);
                    // create File object with the entry and test
                    // if it is a file or directory
                    File f1 = new File(dirpath + dname, s);
                    System.out.println(f1);
                    if (f1.isFile())
                        System.out.println(": is a file");
                    if (f1.isDirectory())
                        System.out.println(": is a directory");
                }
            }
            else {
                throw new NullPointerException("The array of file names is null.");
            }

            System.out.println("No of entries in this directory " + n);
        } else
            System.out.println("Directory not found");
    }
}