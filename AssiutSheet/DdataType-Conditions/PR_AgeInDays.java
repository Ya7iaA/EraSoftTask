import java.util.Scanner;

public class PR_AgeInDays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int numberDays = s.nextInt();

        System.out.println(numberDays / 365 + " years");
        System.out.println((numberDays % 365) / 30 + " months");
        System.out.println((numberDays % 365) % 30 + " days");

        s.close();
    }
}