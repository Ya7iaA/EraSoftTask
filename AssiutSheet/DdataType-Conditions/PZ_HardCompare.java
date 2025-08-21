import java.util.Scanner;

public class PZ_HardCompare {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double firstNumber = s.nextDouble();
        double secondNumber = s.nextDouble();
        double thirdNumber = s.nextDouble();
        double fourthNumber = s.nextDouble();

        System.out
                .println((secondNumber * Math.log(firstNumber) > fourthNumber * Math.log(thirdNumber) ? "YES" : "NO"));

        s.close();
    }
}