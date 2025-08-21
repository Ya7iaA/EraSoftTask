import java.util.Scanner;

public class F_MultipleCatchBlocks {

    public static void toUpperCase(String inputString) {
        System.out.println(inputString.toUpperCase());
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int firstNumber = s.nextInt();
        int secondNumber = s.nextInt();

        try {
            System.out.println(firstNumber / secondNumber);
            toUpperCase(null);
        } catch (ArithmeticException exception) {
            System.out.println("Can not divide by zero");
        } catch (NullPointerException exception) {
            System.out.println("There is no word");
        }

        s.close();
    }
}