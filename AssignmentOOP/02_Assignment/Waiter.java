public class Waiter extends Employee implements Eatable {

    public Waiter(String personName, int personAge, double employeeSalary) {
        super(personName, personAge, employeeSalary, "Waiter");
    }

    @Override
    public void work() {
        System.out.println("Waiter " + gerPersonName() + " is serving customers");
    }

    @Override
    public void eat() {
        System.out.println("Waiter " + gerPersonName() + " is having a quick meal break");
    }
}