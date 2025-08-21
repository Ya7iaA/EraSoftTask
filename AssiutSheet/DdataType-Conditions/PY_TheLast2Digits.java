import java.util.Scanner;

public class PY_TheLast2Digits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int firstNumber = s.nextInt();
        int secondNumber = s.nextInt();
        int thirdNumber = s.nextInt();
        int fourthNumber = s.nextInt();

        int result = (firstNumber % 100) * (secondNumber % 100) * (thirdNumber % 100) * (fourthNumber % 100);

        if (result % 100 < 10) {
            System.out.println("0" + result % 100);
        } else {
            System.out.println(result % 100);
        }

        s.close();
    }
}