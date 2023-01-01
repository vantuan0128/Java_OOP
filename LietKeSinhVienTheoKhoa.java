package OOP_2023;
import java.util.*;

public class LietKeSinhVienTheoKhoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <Student2> list = new ArrayList<>();
        for (int i = 1; i <= n; ++i){
            String msv = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String mail = sc.nextLine();
            Student2 x = new Student2(msv, ten, lop, mail);
            list.add(x);
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0){
            String res = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA " + res + ":");
            for (Student2 x : list){
                if (x.getLop().substring(1,3).equals(res.substring(2))) System.out.println(x);
            }
        }
    }
}

class Student2{
    private String msv, ten, lop, mail;

    public Student2(String msv, String ten, String lop, String mail) {
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
    }

    public String getMsv() {
        return msv;
    }

    public String getLop() {
        return lop;
    }

    @Override
    public String toString() {
        return this.msv + " " + this.ten + " " + this.lop + " " + this.mail;
    }
}