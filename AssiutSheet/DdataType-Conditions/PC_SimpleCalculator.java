import java.util.Scanner;

public class PC_SimpleCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long firstNumber = s.nextLong();
        long secondNumber = s.nextLong();

        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));

        s.close();
    }
}