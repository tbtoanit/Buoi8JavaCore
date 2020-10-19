package demo;

public class App {
    public static void main(String[] args) {
        Person p = new Employee();
        p.personAge = 10;
        p.personName = "Tran";
        System.out.println(p.personWork());
    }
}
