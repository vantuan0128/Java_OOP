
package CodePTIT;

import java.util.*;
public class SapXepBangTinhCong {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        List<Employee1> arr = new ArrayList<>();
        for(int i=1;i<=t;i++){
            String ten = sc.nextLine();
            int luongCB = sc.nextInt();
            int ngayCong = sc.nextInt();
            sc.nextLine();
            String chucVu = sc.nextLine();
            Employee1 e = new Employee1(i,ten,luongCB,ngayCong,chucVu);
            arr.add(e);
        }
        Collections.sort(arr,new Comparator<Employee1>() {
            @Override
            public int compare(Employee1 t, Employee1 t1) {
                return t1.tong() - t.tong();
            }
        });
        for(Employee1 x : arr){
            System.out.println(x);
        }
    }
}
class Employee1{
    private String ten;
    private int luongCB;
    private int ngayCong;
    private String chucVu;
    private String ma;
    public Employee1() {
        ten=chucVu=ma="";
        luongCB=ngayCong=0;
    }

    public Employee1(int id,String ten, int luongCB, int ngayCong, String chucVu) {
        this.ma = "NV" + String.format("%02d",id);
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

    public int getLuong() {
        return luongCB;
    }

    public void setLuong(int luong) {
        this.luongCB = luong;
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
    
    public int luong(){
        return luongCB * ngayCong;
    }
    
    public int thuong(){
        if(ngayCong>=25) return (int) (this.luong()*0.2);
        else if(ngayCong>=22 && ngayCong<25) return (int)(this.luong()*0.1);
        else return 0;
    }
    
    public int troCap(){
        if(this.chucVu.equals("GD")){
            return 250000;
        }
        else if(this.chucVu.equals("PGD")){
            return 200000;
        }
        else if(this.chucVu.equals("TP")){
            return 180000;
        }
        else return 150000;
    }
    
    public int tong(){
        return this.luong() + this.thuong() + this.troCap();
    }
    
    public String toString(){
        return this.ma+" "+this.ten+" "+this.luong()+" "+this.thuong()+" "
                +this.troCap()+" "+this.tong();
    }
}
