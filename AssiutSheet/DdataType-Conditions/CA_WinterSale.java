import java.util.Scanner;

public class CA_WinterSale {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double discountPercentage = s.nextDouble();
        double priceAfter = s.nextDouble();

        double priceBefore = (100 * priceAfter) / (100 - discountPercentage);

        System.out.printf("%.2f\n",priceBefore);

        s.close();
    }
}
