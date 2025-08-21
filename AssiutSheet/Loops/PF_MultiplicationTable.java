import java.util.Scanner;

public class PF_MultiplicationTable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int inputNumber = s.nextInt();

        for (int i = 1; i <= 12; i++) {
            System.out.println(inputNumber+" * "+i+" = "+(i*inputNumber));
        }

        s.close();
    }
}