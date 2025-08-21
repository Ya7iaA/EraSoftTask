import java.util.Scanner;

public class CE_IntervalSweep {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int firstNumber = s.nextInt();
        int secondNumber = s.nextInt();

        System.out.println(
                (firstNumber - secondNumber == 1 || secondNumber - firstNumber == 1
                        || (firstNumber == secondNumber && firstNumber > 0 && secondNumber > 0)
                                ? "YES"
                                : "NO"));

        s.close();
    }
}
