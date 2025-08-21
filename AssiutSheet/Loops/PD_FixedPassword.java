import java.util.Scanner;

public class PD_FixedPassword {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 10000; i++) {
            int checkPassword = s.nextInt();
            if (checkPassword == 1999) {
                System.out.println("Correct");
                break;
            } else {
                System.out.println("Wrong");
            }
        }

        s.close();
    }
}