public class Chef extends Employee {

    public Chef(String personName, int personAge, double employeeSalary) {
        super(personName, personAge, employeeSalary, "Chef");
    }

    @Override
    public void work() {
        System.out.println("Chef " + gerPersonName() + " is preparing dishes");
    }
}