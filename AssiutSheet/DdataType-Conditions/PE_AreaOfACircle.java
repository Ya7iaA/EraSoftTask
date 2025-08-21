import java.util.Scanner;

public class PE_AreaOfACircle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double radiusCircle = s.nextDouble();
        final double piValue = 3.141592653;
        double res = radiusCircle * radiusCircle * piValue;

        System.out.printf("%.9f\n", res);

        s.close();
    }
}