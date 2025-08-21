import java.util.Scanner;

public class PP_FirstDigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int theNumber = s.nextInt();

        System.out.println(((theNumber / 1000) % 2 == 0 ? "EVEN" : "ODD"));

        s.close();
    }
}