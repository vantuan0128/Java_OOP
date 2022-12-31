package OOP_Part2;
import java.util.*;

public class DanhSachGiangVienTheoBoMon {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <Teacher> list = new ArrayList<>();
        for (int i = 1; i <= n; ++i){
            String ten = sc.nextLine();
            String mon = sc.nextLine();
            Teacher x = new Teacher(i, ten, mon);
            list.add(x);
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q --> 0){
            String res = sc.nextLine();
            String ans = "";
            String[] a = res.split("\\s+");
            for (int i = 0; i < a.length; ++i) ans += Character.toUpperCase(a[i].charAt(0));
            System.out.println("DANH SACH GIANG VIEN BO MON " + ans + ":");
            for (Teacher x : list){
                if (x.getMon().equals(res)) System.out.println(x + ans);
            }
        }
    }
}

class Teacher{
    private String ma, ten, mon;

    public Teacher(int ma, String ten, String mon) {
        this.ma = "GV" + String.format("%02d", ma);
        this.ten = ten;
        this.mon = mon;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getMon() {
        return mon;
    }
    
    @Override
    public String toString() {
        return this.ma + " " + this.ten + " ";
    }
}