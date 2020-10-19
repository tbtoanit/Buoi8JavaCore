package demo;

public abstract class Person {
    String personName;
    int personAge;

    public abstract String personWork();

    public float tinhDienTich(){
        System.out.println("Dien tich da giac");

        return 1.0f;
    }
}
