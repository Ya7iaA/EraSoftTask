import java.util.Scanner;

public class PQ_CoordinatesOfaPoint {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double xAxis = s.nextDouble();
        double yAxis = s.nextDouble();

        if (xAxis == 0 && yAxis == 0) {
            System.out.println("Origem");
        } else if (xAxis == 0) {
            System.out.println("Eixo Y");
        } else if (yAxis == 0) {
            System.out.println("Eixo X");
        } else if (xAxis < 0) {
            if (yAxis < 0) {
                System.out.println("Q3");
            } else {
                System.out.println("Q2");
            }
        } else if (xAxis > 0) {
            if (yAxis > 0) {
                System.out.println("Q1");
            } else {
                System.out.println("Q4");
            }
        }

        s.close();
    }
}