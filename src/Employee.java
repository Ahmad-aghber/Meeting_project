public class Employee {

    private final String name;
    private final String nationalID;

    public Employee(String name, String nationalID) {
        this.name = name;
        this.nationalID = nationalID;
    }

    public String getName() {
        return name;
    }

    public String getNationalID() {
        return nationalID;
    }

    @Override
    public String toString() {
        return "Employee name : " + this.name;
    }
}
