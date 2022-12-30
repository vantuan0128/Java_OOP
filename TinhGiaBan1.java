
package CodePTIT;

import java.util.*;

public class TinhGiaBan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<GiaBan1> arr = new ArrayList<>();
        for(int i=1;i<=t;i++){
            String ten = sc.nextLine();
            String donVi = sc.nextLine();
            long donGia = Long.parseLong(sc.nextLine());
            long soLuong = Long.parseLong(sc.nextLine());
            GiaBan1 x = new GiaBan1(i,ten,donVi,donGia,soLuong);
            arr.add(x);
        }
        for(GiaBan1 x : arr) System.out.println(x);
    }
}
class GiaBan1{
    private String id,ten,donVi;
    private long donGia,soLuong;

    public GiaBan1(int id, String ten, String donVi, long donGia, long soLuong) {
        this.id = "MH"+String.format("%02d",id);
        this.ten = ten;
        this.donVi = donVi;
        this.donGia = donGia;
        this.soLuong = soLuong;
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
    
    public String toString(){
        return id+" "+ten+" "+donVi+" "+phiVanChuyen()+" "+thanhTien()+" "+giaBan();
    }
}
