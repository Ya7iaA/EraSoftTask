import java.util.Scanner;

public class PE_Max {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int inputNumber = s.nextInt();
        int maxNumber = 0;

        for (int i = 0; i < inputNumber; i++) {
            int checkNumber = s.nextInt();
            if (checkNumber > maxNumber) {
                maxNumber = checkNumber;
            }
        }

        System.out.println(maxNumber);

        s.close();
    }
}