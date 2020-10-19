package dahinh.override;

import org.example.DaGiac;

public class Test {
    public static void main(String[] args) {
        DaGiac d;
        d = new DaGiac();
        d.tinhDienTich();

        d= new Tamgiac();
        d.tinhDienTich();

        d = new HinhChuNhat();
        d.tinhDienTich();
    }
}
