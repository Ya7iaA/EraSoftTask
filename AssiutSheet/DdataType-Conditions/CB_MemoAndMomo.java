import java.util.Scanner;

public class CB_MemoAndMomo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long memoNumber = s.nextLong();
        long momoNumber = s.nextLong();
        long checkNumber = s.nextLong();

        if (memoNumber % checkNumber != 0 && momoNumber % checkNumber != 0) {
            System.out.println("No One");
        } else if (memoNumber % checkNumber == 0 && momoNumber % checkNumber == 0) {
            System.out.println("Both");
        } else if (memoNumber % checkNumber == 0 & momoNumber % checkNumber != 0) {
            System.out.println("Memo");
        } else if (memoNumber % checkNumber != 0 & momoNumber % checkNumber == 0) {
            System.out.println("Momo");
        }

        s.close();
    }
}
