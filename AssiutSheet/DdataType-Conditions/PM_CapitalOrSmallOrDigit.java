import java.util.Scanner;

public class PM_CapitalOrSmallOrDigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        char inputChar = s.next().charAt(0);

        System.out.println((inputChar >= 97) ? "ALPHA\nIS SMALL" : inputChar >= 65 ? "ALPHA\nIS CAPITAL" : "IS DIGIT");

        s.close();
    }
}