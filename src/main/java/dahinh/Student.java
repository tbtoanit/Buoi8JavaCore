package dahinh;

public class Student {
    private int studentID;
    private String studentName;
    private int age;
    //Adding age

    public Student(){}

    public Student(int maHV){
        this.studentID = maHV;
    }

    public Student(String tenHV){
        this.studentName = tenHV;
    }

    public Student(int ma, String ten){
        this.studentID = ma;
        this.studentName = ten;
    }
}
