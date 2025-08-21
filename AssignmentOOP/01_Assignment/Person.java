public class Person {

    private String personName;
    private int personAge;

    public Person(String personName, int personAge) {
        this.personName = personName;
        this.personAge = personAge;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String gerPersonName() {
        return personName;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void introduce() {
        System.out.println("Person Name : " + personName);
        System.out.println("Person Age : " + personAge);
    }
}