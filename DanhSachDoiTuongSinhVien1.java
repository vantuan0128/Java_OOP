package OOP_2023;

import java.util.*;

public class DanhSachDoiTuongSinhVien1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <SinhVien> list = new ArrayList<>();
        for (int i = 1; i <= n; ++i){
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String ns = sc.nextLine();
            double diem = Double.parseDouble(sc.nextLine());
            SinhVien x = new SinhVien(i, ten, lop, ns, diem);
            x.chuanHoa();
            list.add(x);
        }
        for (SinhVien x : list) System.out.println(x);
    }
}

class SinhVien{
    private String ma, ten, lop, ns;
    private double diem;

    public SinhVien(int ma, String ten, String lop, String ns, double diem) {
        this.ma = "B20DCCN" + String.format("%03d", ma);
        this.ten = ten;
        this.lop = lop;
        this.ns = ns;
        this.diem = diem;
    }

    public void chuanHoa(){
        StringBuilder sb = new StringBuilder(this.ns);
        if (sb.charAt(1) == '/') sb.insert(0,"0");
        if (sb.charAt(4) == '/') sb.insert(3,"0");
        this.ns = sb.toString();
    }

    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + 
                this.lop + " " + this.ns + " " + String.format("%.2f", this.diem);
    }
}
