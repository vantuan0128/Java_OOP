package OOP_2023;

import java.util.*;

public class TinhGiaBan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Product2> l2 = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String ten = sc.nextLine();
            String donVi = sc.nextLine();
            long giaNhap = Long.parseLong(sc.nextLine());
            long soLuong = Long.parseLong(sc.nextLine());
            Product2 p2 = new Product2(i,ten,donVi,giaNhap,soLuong);
            l2.add(p2);
        }
        Collections.sort(l2,new Comparator<Product2>(){
           public int compare(Product2 o1, Product2 o2){
               if(o2.giaBan() < o1.giaBan()) return -1;
               return 1;
           } 
        });
        for(Product2 p2 : l2) System.out.println(p2);
    }
}

class Product2{
    public String ma,ten,donVi;
    private long giaNhap,soLuong;

    public Product2(int ma, String ten, String donVi, long giaNhap, long soLuong) {
        this.ma = "MH" +String.format("%02d",ma);
        this.ten = ten;
        this.donVi = donVi;
        this.giaNhap = giaNhap;
        this.soLuong = soLuong;
    }
    
    public String toString(){
        return this.ma + " " + this.ten + " " + this.donVi+" "
            +(long) this.phiVanChuyen() + " " + (long) this.thanhTien() +
                " " + (long) this.giaBan();
    }    
    
    public long phiVanChuyen(){
        return Math.round(giaNhap*soLuong*0.05);
    }
    
    public long thanhTien(){
        return Math.round(giaNhap*soLuong + this.phiVanChuyen());
    }
    
    public long giaBan(){
        return (long) ((Math.ceil((this.thanhTien() + (long)this.thanhTien() * 0.02) / this.soLuong) + 99) / 100 ) * 100;
    }
}
