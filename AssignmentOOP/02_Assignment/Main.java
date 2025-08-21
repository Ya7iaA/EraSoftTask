import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Chef chef = new Chef(s.nextLine(), s.nextInt(), s.nextDouble());
        chef.eat();
        chef.work();
        Waiter waiter = new Waiter(s.nextLine(), s.nextInt(), s.nextDouble());
        waiter.eat();
        waiter.work();

        s.close();
    }
}