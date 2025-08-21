public class Waiter extends Employee {

    public Waiter(String personName, int personAge, double employeeSalary) {
        super(personName, personAge, employeeSalary, "Waiter");
    }

    @Override
    public void work() {
        System.out.println("Waiter " + gerPersonName() + " is serving customers");
    }
}