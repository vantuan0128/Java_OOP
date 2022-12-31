package OOP_Part2;

import java.util.*;

public class DanhSachDoanhNghiepNhanSinhVienThucTap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <DoanhNghiep> list = new ArrayList<>();
        for (int i = 1; i <= n; ++i){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int sl = Integer.parseInt(sc.nextLine());
            DoanhNghiep x = new DoanhNghiep(ma, ten, sl);
            list.add(x);
        }
        Collections.sort(list,new Comparator<DoanhNghiep>(){
            public int compare(DoanhNghiep o1,DoanhNghiep o2) {
                if (o1.getSl() == o2.getSl()) return o2.getMa().compareTo(o1.getMa());
                 return o2.getSl() - o1.getSl();
            }
        });
        
        for (DoanhNghiep x : list) System.out.println(x);
    }
}

class DoanhNghiep {
    private String ma, ten;
    private int sl;

    public DoanhNghiep(String ma, String ten, int sl) {
        this.ma = ma;
        this.ten = ten;
        this.sl = sl;
    }

    public String getMa(){
        return ma;
    }
    
    public int getSl(){
        return sl;
    }
    
    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.sl;
    }

}