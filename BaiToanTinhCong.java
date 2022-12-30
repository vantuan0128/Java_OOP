
package CodePTIT;

import java.util.*;
public class BaiToanTinhCong {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Employee e = new Employee();
        e.setTen(sc.nextLine());
        e.setLuongCB(sc.nextInt());
        e.setNgayCong(sc.nextInt());
        sc.nextLine();
        e.setChucVu(sc.nextLine());
        e.Salary();
        e.Bonus();
        e.Allowance();
        e.InCome();
        System.out.println(e);
    }
}
class Employee{
    private String ten;
    private int luongCB;
    private int ngayCong;
    private String chucVu;
    private int luong,thuong,phuCap,thuNhap;
    public Employee() {
        this.ten=this.chucVu="";
        this.luongCB=this.ngayCong=this.luong=this.phuCap=this.thuNhap=0;
    }

    public Employee(String ten, int luongCB, int ngayCong, String chucVu) {
        this.ten = ten;
        this.luongCB = luongCB;
        this.ngayCong = ngayCong;
        this.chucVu = chucVu;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(int luongCB) {
        this.luongCB = luongCB;
    }

    public int getNgayCong() {
        return ngayCong;
    }

    public void setNgayCong(int ngayCong) {
        this.ngayCong = ngayCong;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
    
    public void Salary(){
        this.luong = this.luongCB * this.ngayCong;
    }
    
    public void Bonus(){
        if(this.ngayCong>=25){
            this.thuong = (int) this.luong / 5;
        }
        else if(this.ngayCong>=22 && this.ngayCong<25){
            this.thuong = (int) this.luong / 10;
        }
        else this.thuong = 0;
    }
    
    public void Allowance(){
        if(this.chucVu.equals("GD")){
            this.phuCap = 250000;
        }
        else if(this.chucVu.equals("PGD")){
            this.phuCap = 200000;
        }
        else if(this.chucVu.equals("TP")){
            this.phuCap = 180000;
        }
        else if(this.chucVu.equals("NV")){
            this.phuCap = 150000;
        }
    }
    
    public void InCome(){
        this.thuNhap =  this.luong + this.thuong + this.phuCap;
    }
    public String toString(){
        return "NV01 "+ this.ten + " " + this.luong + " " +
                this.thuong + " " + this.phuCap + " " + this.thuNhap;
    }
}
