import java.util.Scanner;

public class CC_NextAlphabet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        char inputChar = s.next().charAt(0);

        System.out.println((inputChar == 122 ? "a" : (char) (inputChar + 1)));

        s.close();
    }
}