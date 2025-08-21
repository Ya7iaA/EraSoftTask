import java.util.Scanner;

public class PG_Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int inputNumber = s.nextInt();

        for (int i = 0; i < inputNumber; i++) {
            int factNumber = s.nextInt();
            if (factNumber == 0 || factNumber == 1) {
                System.out.println(1);
            } else {
                long factResult = 1;
                for (int k = 1; k <= factNumber; k++) {
                    factResult *= k;
                }
                System.out.println(factResult);
            }
        }

        s.close();
    }
}