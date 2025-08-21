import java.util.Scanner;

public class PC_EvenOddPositiveAndNegative {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int inputNumber = s.nextInt();
        int evenNumber = 0;
        int positiveNumber = 0;
        int oddNumber = 0;
        int negativeNumber = 0;

        for (int i = 0; i < inputNumber; i++) {
            int checkNumber = s.nextInt();
            evenNumber += (checkNumber % 2 == 0)?1:0;
            oddNumber += (checkNumber % 2 != 0)?1:0;
            positiveNumber += (checkNumber > 0)?1:0;
            negativeNumber += (checkNumber < 0)?1:0;
        }

        System.out.println("Even: "+evenNumber);
        System.out.println("Odd: "+oddNumber);
        System.out.println("Positive: "+positiveNumber);
        System.out.println("Negative: "+negativeNumber);

        s.close();
    }
}