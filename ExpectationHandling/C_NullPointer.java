import java.util.Scanner;

public class C_NullPointer {

    public static void toUpperCase(String inputString) {
        System.out.println(inputString.toUpperCase());
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            toUpperCase(null);
        } catch (NullPointerException exception) {
            System.out.println("There is no word");
        }

        s.close();
    }
}