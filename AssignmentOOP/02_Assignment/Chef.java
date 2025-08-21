public class Chef extends Employee implements Eatable {

    public Chef(String personName, int personAge, double employeeSalary) {
        super(personName, personAge, employeeSalary, "Chef");
    }

    @Override
    public void work() {
        System.out.println("Chef " + gerPersonName() + " is preparing dishes");
    }

    @Override
    public void eat() {
        System.out.println("Chef " + gerPersonName() + " is tasting the food");
    }
}