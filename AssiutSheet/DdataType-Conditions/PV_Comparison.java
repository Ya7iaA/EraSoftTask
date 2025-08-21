import java.util.Scanner;

public class PV_Comparison {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int firstNumber = s.nextInt();
        char inputOperator = s.next().charAt(0);
        int secondNumber = s.nextInt();

        if (inputOperator == '=') {
            if (firstNumber == secondNumber) {
                System.out.println("Right");
            } else {
                System.out.println("Wrong");
            }
        } else if (inputOperator == '>') {
            if (firstNumber > secondNumber) {
                System.out.println("Right");
            } else {
                System.out.println("Wrong");
            }
        } else if (inputOperator == '<') {
            if (firstNumber < secondNumber) {
                System.out.println("Right");
            } else {
                System.out.println("Wrong");
            }
        }

        s.close();
    }
}