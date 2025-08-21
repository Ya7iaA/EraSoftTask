import java.util.Scanner;

public class A_DivideTwoNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int firstNumber = s.nextInt();
        int secondNumber = s.nextInt();

        try {
            System.out.println(firstNumber / secondNumber);
        } catch (ArithmeticException exception) {
            System.out.println("Can not divide by zero");
        }

        s.close();
    }
}