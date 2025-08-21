import java.util.Scanner;

public class PU_FloatOrInt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        float inputNumber = s.nextFloat();

        System.out.println((inputNumber - (int) inputNumber == 0 ? "int " + (int) inputNumber
                : "float " + (int) inputNumber + " " + ((float) inputNumber - (int) inputNumber)));

        s.close();
    }
}