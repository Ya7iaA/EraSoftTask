import java.util.Scanner;

public class PI_WelcomeForYouWithConditions {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int firstNumber = s.nextInt();
        int secondNumber = s.nextInt();

        System.out.println((firstNumber >= secondNumber ? "Yes" : "No"));

        s.close();
    }
}