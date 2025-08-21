import java.util.Scanner;

public class PH_OnePrime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int inputNumber = s.nextInt();
        int checkFlag = 0;

        if (inputNumber <= 1) {
            System.out.println("NO");
        } else if (inputNumber == 2) {
            System.out.println("YES");
        } else {
            for (int i = 2; i < inputNumber / 2; i++) {
                if (inputNumber % i == 0) {
                    checkFlag = 1;
                    break;
                }
            }
            System.out.println((checkFlag == 1 ? "NO" : "YES"));
        }

        s.close();
    }
}