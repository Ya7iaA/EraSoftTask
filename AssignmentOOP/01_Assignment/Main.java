import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Person person = new Person(s.nextLine(), s.nextInt());
        person.introduce();
        System.out.println("---------------------------");
        Employee employee = new Employee(s.nextLine(), s.nextInt(), s.nextDouble(), s.nextLine());
        employee.work();
        System.out.println("---------------------------");
        Chef chef = new Chef(s.nextLine(), s.nextInt(), s.nextDouble());
        chef.work();
        System.out.println("---------------------------");
        Waiter waiter = new Waiter(s.nextLine(), s.nextInt(), s.nextDouble());
        waiter.work();

        s.close();
    }
}