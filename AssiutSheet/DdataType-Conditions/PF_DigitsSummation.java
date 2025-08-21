import java.util.Scanner;

public class PF_DigitsSummation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long firstNumber = s.nextLong();
        long secondNumber = s.nextLong();

        System.out.println(firstNumber % 10 + secondNumber % 10);

        s.close();
    }
}