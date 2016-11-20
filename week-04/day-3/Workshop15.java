import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Anna812 on 11/20/2016.
 */
public class Workshop15 {

    public static void main(String[] args) {

        System.out.println("Enter the file path, or q to Quit");

        Scanner userInput = new Scanner(System.in);
        String filePath;

        System.out.print("File path: ");

        while(userInput.hasNextLine()){
            filePath = userInput.nextLine();
            if(filePath.equals("q"))
                break;
            printFileContent(filePath);
            System.out.print("File path: ");
        }
    }

    private static void printFileContent (String filePath) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("The specified path does not exists!");

        } catch (IOException e) {
            e.printStackTrace();
        }
        // Implement this function
        // Open and read the file and print it's content to the standard output
        // If a specified path does not exist write "The specified path does not exists!"
    }
}
