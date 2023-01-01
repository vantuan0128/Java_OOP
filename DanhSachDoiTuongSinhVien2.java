package OOP_2023;

import java.util.*;

public class DanhSachDoiTuongSinhVien2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <SinhVien2> list = new ArrayList<>();
        for (int i = 1; i <= n; ++i){
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String ns = sc.nextLine();
            double diem = Double.parseDouble(sc.nextLine());
            SinhVien2 x = new SinhVien2(i, ten, lop, ns, diem);
            x.chuanHoa();
            list.add(x);
        }
        for (SinhVien2 x : list) System.out.println(x);
    }
}

class SinhVien2{
    private String ma, ten, lop, ns;
    private double diem;

    public SinhVien2(int ma, String ten, String lop, String ns, double diem) {
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
        String[] s = ten.split("\\s+");
        String res = "";
        for(int i=0;i<s.length;i++){
            String ans ="";
            for(int j=0;j<s[i].length();j++){
                if(j==0) ans += Character.toUpperCase(s[i].charAt(j));
                else ans += Character.toLowerCase(s[i].charAt(j));
            }
            res = res + ans + " ";
        }
        res = res.substring(0,res.length()-1);
        this.ten = res;
    }

    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + 
                this.lop + " " + this.ns + " " + String.format("%.2f", this.diem);
    }
}