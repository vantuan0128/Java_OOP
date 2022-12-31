package OOP_Part2;

import java.util.*;

public class DanhSachDoanhNghiepNhanSinhVienThucTap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <DoanhNghiep2> list = new ArrayList<>();
        for (int i = 1; i <= n; ++i){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int sl = Integer.parseInt(sc.nextLine());
            DoanhNghiep2 x = new DoanhNghiep2(ma, ten, sl);
            list.add(x);
        }
        Collections.sort(list,new Comparator<DoanhNghiep2>(){           
            @Override
            public int compare(DoanhNghiep2 o1,DoanhNghiep2 o2) {
                if (o1.getSl() == o2.getSl()) return o1.getMa().compareTo(o2.getMa());
                    return o2.getSl() - o1.getSl();
            }
        });
        int q = sc.nextInt();
        while (q-- > 0){
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a + " DEN " + b + " SINH VIEN:");
            for (DoanhNghiep2 x : list){
                if (x.getSl() >= a && x.getSl() <= b) System.out.println(x);
            }
        }
    }
}

class DoanhNghiep2{
    private String ma, ten;
    private int sl;

    public DoanhNghiep2(String ma, String ten, int sl) {
        this.ma = ma;
        this.ten = ten;
        this.sl = sl;
    }
    
    public String getMa(){
        return ma;
    }

    public int getSl() {
        return sl;
    }

    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.sl;
    }
}