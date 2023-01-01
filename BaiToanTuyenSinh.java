
package OOP_2023;

import java.util.*;
public class BaiToanTuyenSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ThiSinh s = new ThiSinh();
        s.setMa(sc.nextLine());
        s.setTen(sc.nextLine());
        s.setToan(sc.nextFloat());
        s.setLy(sc.nextFloat());
        s.setHoa(sc.nextFloat());
        System.out.print(s.getMa()+" "+s.getTen()+" ");
        
        s.Priority();
        
        if(s.getUuTien()==1.0){
            System.out.printf("%.0f ",s.getUuTien());
        }
        else{
            System.out.printf("%.1f ",s.getUuTien());
        }
        
        s.tong();
        
        if(s.getTong() != (int) s.getTong()){
            System.out.printf("%.1f ",s.getTong());
        }
        else{
            System.out.printf("%.0f ",s.getTong());
        }
        
        s.Status();
        
        System.out.print(s.getTrangThai());
    }
}
class ThiSinh{
    private String ma,ten;
    private float toan,ly,hoa;
    private float uuTien;
    private float tong;
    private String trangThai;
    public ThiSinh(){
        this.ma=this.ten="";
        this.toan=this.ly=this.hoa=0;
    }
    public ThiSinh(String ma, String ten, float toan, float ly, float hoa) {
        this.ma = ma;
        this.ten = ten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    
    public float getUuTien() {
        return uuTien;
    }

    public void setUuTien(float uuTien) {
        this.uuTien = uuTien;
    }

    public float getTong() {
        return tong;
    }

    public void setTong(float tong) {
        this.tong = tong;
    }

    
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getToan() {
        return toan;
    }

    public void setToan(float toan) {
        this.toan = toan;
    }

    public float getLy() {
        return ly;
    }

    public void setLy(float ly) {
        this.ly = ly;
    }

    public float getHoa() {
        return hoa;
    }

    public void setHoa(float hoa) {
        this.hoa = hoa;
    }
    
    public void Priority(){
        String s = this.ma.substring(0,3);
        if(s.equals("KV1")){
            this.uuTien = (float) 0.5;
        }
        else if(s.equals("KV2")){
            this.uuTien = (float) 1.0;
        }
        else if(s.equals("KV3")){
            this.uuTien = (float) 2.5;
        }
    }
    
    public void tong(){
        this.tong = this.toan*2 + this.ly + this.hoa;
    }
    
    public void Status(){
        float f = this.tong + this.uuTien;
        if(f >= 24){
            this.trangThai="TRUNG TUYEN";
        }
        else this.trangThai = "TRUOT";
    }
    
}
