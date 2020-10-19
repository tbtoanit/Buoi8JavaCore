package demo;

public class Employee extends Person {
    String employeeID;

    @Override
    public String personWork() {
        return "Employee is working";
    }
}
