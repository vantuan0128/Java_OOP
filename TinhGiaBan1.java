
package OOP_2023;

import java.util.*;

public class TinhGiaBan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<Product1> l = new ArrayList<>();
        for(int i=1;i<=t;i++){
            String ten = sc.nextLine();
            String donVi = sc.nextLine();
            long donGia = Long.parseLong(sc.nextLine());
            long soLuong = Long.parseLong(sc.nextLine());
            Product1 p = new Product1(i,ten,donVi,donGia,soLuong);
            l.add(p);
        }
        for(Product1 p : l) System.out.println(p);
    }
}

class Product1{
    private String ma,ten,donVi;
    private long donGia,soLuong;

    public Product1(int ma, String ten, String donVi, long donGia, long soLuong) {
        this.ma = "MH"+String.format("%02d",ma);
        this.ten = ten;
        this.donVi = donVi;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
    
    public String toString(){
        return id+" "+ten+" "+donVi+" "+phiVanChuyen()+" "+thanhTien()+" "+giaBan();
    }
    
    public long phiVanChuyen(){
        return Math.round((donGia*soLuong)*0.05);
    }
    
    public long thanhTien(){
        return Math.round(donGia*soLuong+phiVanChuyen());
    }
    
    public long giaBan(){
        return Math.round(thanhTien() + 0.02*thanhTien());
    }
 
}
