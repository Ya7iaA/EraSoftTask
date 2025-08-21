import java.util.Scanner;

public class PH_TwoNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int firstNumber = s.nextInt();
        int secondNumber = s.nextInt();
        float result = (float) firstNumber / secondNumber;

        System.out.println(
                "floor " + firstNumber + " / " + secondNumber + " = " + (int) Math.floor(result));
        System.out.println(
                "ceil " + firstNumber + " / " + secondNumber + " = " + (int) Math.ceil(result));
        System.out.println(
                "round " + firstNumber + " / " + secondNumber + " = " + (int) Math.round(result));

        s.close();
    }
}