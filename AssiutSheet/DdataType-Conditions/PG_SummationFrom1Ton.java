import java.util.Scanner;

public class PG_SummationFrom1Ton {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long endNumber = s.nextInt();
        long result = (endNumber * (endNumber + 1)) / 2;

        System.out.println(result);

        s.close();
    }
}