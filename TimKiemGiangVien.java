package OOP_2023;
import java.util.*;

public class TimKiemGiangVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <GiangVien2> list = new ArrayList<>();
        for (int i = 1; i <= n; ++i){
            String ten = sc.nextLine();
            String mon = sc.nextLine();
            GiangVien2 x = new GiangVien2(i, ten, mon);
            list.add(x);
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0){
            String res = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + res + ":");
            String ans = "";
            for (char x : res.toCharArray()) ans += Character.toLowerCase(x);
            for (GiangVien2 x : list){
                String tmp = "";
                for (int i = 0; i < x.getTen().length(); ++i) tmp += Character.toLowerCase(x.getTen().charAt(i));
                if (tmp.contains(ans)) System.out.println(x);
            }
        }
    }
}

class GiangVien2{
    private String ma, ten, mon;

    public GiangVien2(int ma, String ten, String mon) {
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
        String res = "";
        String[] s = this.mon.split("\\s+");
        for (int i = 0; i < s.length; ++i) res += Character.toUpperCase(s[i].charAt(0));
        return this.ma + " " + this.ten + " " + res;
    }
}