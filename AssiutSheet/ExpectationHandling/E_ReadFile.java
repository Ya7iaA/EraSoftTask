import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class E_ReadFile {
    public static void main(String[] args) {

        try {
            File f = new File("Ali");
            Scanner s = new Scanner(f);
            s.close();
        } catch (FileNotFoundException exception) {
            System.out.println("The file that you want doesn't exist");
        }
    }
}