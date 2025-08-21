import java.util.Scanner;

public class PJ_Multiples {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int firstNumber = s.nextInt();
        int secondNumber = s.nextInt();

        System.out.println(
                (firstNumber % secondNumber == 0 || secondNumber % firstNumber == 0 ? "Multiples" : "No Multiples"));

        s.close();
    }
}