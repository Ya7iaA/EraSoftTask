import java.util.Scanner;

public class PO_Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long firstNumber = s.nextInt();
        char inputOperator = s.next().charAt(0);
        long secondNumber = s.nextInt();

        switch (inputOperator) {
            case '+':
                System.out.println(firstNumber + secondNumber);
                break;
            case '-':
                System.out.println(firstNumber - secondNumber);
                break;
            case '*':
                System.out.println(firstNumber * secondNumber);
                break;
            case '/':
                System.out.println(firstNumber / secondNumber);
                break;
            default:
                System.out.println("Invalid  Operator");
                break;
        }

        s.close();
    }
}