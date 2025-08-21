import java.util.Scanner;

public class PW_MathematicalExpression {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int firstNumber = s.nextInt();
        char inputOperator = s.next().charAt(0);
        int secondNumber = s.nextInt();
        char assignmentOperator = s.next().charAt(0);
        int inputResult = s.nextInt();

        if (inputOperator == '+') {
            if (firstNumber + secondNumber == inputResult) {
                System.out.println("Yes");
            } else {
                System.out.println(firstNumber + secondNumber);
            }
        } else if (inputOperator == '-') {
            if (firstNumber - secondNumber == inputResult) {
                System.out.println("Yes");
            } else {
                System.out.println(firstNumber - secondNumber);
            }
        } else if (inputOperator == '*') {
            if (firstNumber * secondNumber == inputResult) {
                System.out.println("Yes");
            } else {
                System.out.println(firstNumber * secondNumber);
            }
        }

        s.close();
    }
}