import java.util.Scanner;

public class PS_Interval {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double inputNumber = s.nextDouble();

        if (inputNumber < 0 || inputNumber > 100) {
            System.out.println("Out of Intervals");
        } else if (inputNumber <= 25) {
            System.out.println("Interval [0,25]");
        } else if (inputNumber <= 50) {
            System.out.println("Interval (25,50]");
        } else if (inputNumber <= 75) {
            System.out.println("Interval (50,75]");
        } else if (inputNumber <= 100) {
            System.out.println("Interval (75,100]");
        }

        s.close();
    }
}