import java.util.Scanner;

public class PA_1ToN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int inputNumber = s.nextInt();

        for (int i = 1; i <= inputNumber; i++) {
            System.out.println(i);
        }

        s.close();
    }
}