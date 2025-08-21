import java.util.Scanner;

public class PK_MaxAndMin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int firstNumber = s.nextInt();
        int secondNumber = s.nextInt();
        int thirdNumber = s.nextInt();

        System.out.print((firstNumber < secondNumber ? (firstNumber < thirdNumber ? firstNumber : thirdNumber)
                : (secondNumber < thirdNumber ? secondNumber : thirdNumber)));
        System.out.print(" ");
        System.out.print((firstNumber > secondNumber ? (firstNumber > thirdNumber ? firstNumber : thirdNumber)
                : (secondNumber > thirdNumber ? secondNumber : thirdNumber)));

        s.close();
    }
}