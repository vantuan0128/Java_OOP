package OOP_2023;

import java.util.*;

public class LietKeSinhVienTheoLop {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <Student> list = new ArrayList<>();
        for (int i = 1; i <= n; ++i){
            String msv = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String mail = sc.nextLine();
            Student x = new Student(msv, ten, lop, mail);
            list.add(x);
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0){
            String res = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + res + ":");
            for (Student x : list){
                if (x.getLop().equals(res)) System.out.println(x);
            }
        }
    }
}

class Student{
    private String msv, ten, lop, mail;

    public Student(String msv, String ten, String lop, String mail) {
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