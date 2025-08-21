import java.util.Scanner;

public class PB_EvenNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int inputNumber = s.nextInt();
        int evenCounter = 0;

        for (int i = 1; i <= inputNumber; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                evenCounter++;
            }
        }
        if (evenCounter == 0) {
            System.out.println(-1);
        }

        s.close();
    }
}