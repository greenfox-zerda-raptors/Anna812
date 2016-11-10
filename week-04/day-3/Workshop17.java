/**
 * Created by Anna812 on 11/10/2016.
 */
/**
 * File I/O: The copy command exercise
 *
 * This is just standard I/O and it's usually given as an early IT assignment.
 * Given all that you've already seen and done, this should be fairly easy.
 *
 * This is how it should work, but NOTE ...
 * >>> means that what the computer does; and
 * <<< is what you the user does.
 *
 * >>> Enter the Source filename (assuming reading from C:\TEMP\) or give a different path name to?
 * <<< TestA.txt
 * >>> File does not exist, try again or blank to exit
 * <<< Test.txt
 * >>> Enter the Target filename (assuming writing to C:\TEMP\) or give a different path name?
 * <<< NewTest.txt
 * >>> Writing from C:\TEMP\Test.txt to C:\TEMP\NewTest.txt.  Press Y to confirm, N to abort.
 * <<< Y
 * >>> Done, wrote 102 Characters to C:\TEMP\NewTest.txt.
 *
 * Note that you should compute the working directory (e.g. C:\TEMP\).
 */

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.logging.FileHandler;

public class Workshop17 {

    static File randomFile, randomFile2, randomDir;

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String strDirectoryPath = "D:/Anna";
        String strFileName = "Test";
        String strExtension = ".txt";
        randomDir = new File(strDirectoryPath);
        randomDir.mkdir();
        randomFile = new File(strDirectoryPath + "/" + strFileName + strExtension);
//        randomFile2 = new File(strDirectoryPath + "/" + "New" + strFileName + strExtension);

        try {
            randomFile.createNewFile();
//            randomFile2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String path;
        System.out.println("Enter the Source filename (assuming reading from C:\\TEMP\\) or give a different path name to?");
        while (userInput.hasNextLine()) {
            path = userInput.nextLine();
            if (path.equals("q"))
                break;
            else {
                File inputFile = new File(path);
                if (inputFile.exists()) {
                    System.out.println("Enter the Target filename (assuming writing to C:\\TEMP\\) or give a different path name?");
                    File path2 = new File (userInput.nextLine());
                    if (path2.exists()){
                        System.out.println("Writing from C:\\TEMP\\Test.txt to C:\\TEMP\\NewTest.txt.  Press Y to confirm, N to abort.");
                    } else {
                        try {
                            path2.createNewFile();
                            randomFile2 = path2;
                        } catch (IOException e) {
                        } finally {
                            System.out.println("Writing from C:\\TEMP\\Test.txt to C:\\TEMP\\NewTest.txt.  Press Y to confirm, N to abort.");
                        }
                    }
                    String inputYes = userInput.next();
                    if (inputYes.equals("Y")) {
                        FileReader fr = null;
                        FileWriter fw = null;
                        try {
                            fr = new FileReader(randomFile);
                            fw = new FileWriter(randomFile2);
                            int c;
                            while ((c = fr.read()) != -1) {
                                fw.write(c);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        } finally {
                            try {
                                fr.close();
                                fw.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    } else {
                        break;
                    }
                    System.out.println("Done, wrote 102 Characters to C:\\TEMP\\NewTest.txt");
                } else {
                    System.out.println("File does not exist, try again or blank to exit");
                }
            }
        }
    }
}