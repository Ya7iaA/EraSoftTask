import java.util.Scanner;

public class PL_TheBrothers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String firstPersonFirstName = s.next();
        String firstPersonLastName = s.next();
        String secondPersonFirstName = s.next();
        String secondPersonLastName = s.next();

        System.out.println((firstPersonLastName.equals(secondPersonLastName) ? "ARE Brothers" : "NOT"));

        s.close();
    }
}