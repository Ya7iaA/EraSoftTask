public class Employee extends Person {

    private double employeeSalary;
    private String employeeRole;

    public Employee(String personName, int personAge, double employeeSalary, String employeeRole) {
        super(personName, personAge);
        this.employeeSalary = employeeSalary;
        this.employeeRole = employeeRole;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeRole(String employeeRole) {
        this.employeeRole = employeeRole;
    }

    public String getEmployeeRole() {
        return employeeRole;
    }

    public void work() {
        System.out.println("The Employee Role is : " + employeeRole);
    }
}