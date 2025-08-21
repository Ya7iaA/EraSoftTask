import java.util.Scanner;

public class CD_AliBabaAndPuzzles {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long firstNumber = s.nextLong();
        long secondNumber = s.nextLong();
        long  thirdNumber = s.nextLong();
        long  inputResult = s.nextLong();

        if (firstNumber + secondNumber * thirdNumber == inputResult) {
            System.out.println("YES");
        } else if (firstNumber + secondNumber - thirdNumber == inputResult) {
            System.out.println("YES");
        } else if (firstNumber - secondNumber * thirdNumber == inputResult) {
            System.out.println("YES");
        } else if (firstNumber - secondNumber + thirdNumber == inputResult) {
            System.out.println("YES");
        } else if (firstNumber * secondNumber + thirdNumber == inputResult) {
            System.out.println("YES");
        } else if (firstNumber * secondNumber - thirdNumber == inputResult) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        s.close();
    }
}
