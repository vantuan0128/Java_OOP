/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi1;
import java.util.*;
/**
 *
 * @author Tuấn
 */
public class LopPhanSo {
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        PhanSo ps = new PhanSo();
        ps.setTu(sc.nextLong());
        ps.setMau(sc.nextLong());
        System.out.println(ps.RutGonPhanSo());
        sc.close();
    }
}
class PhanSo{
    private long tu,mau;
    public PhanSo(){
        tu = mau = 0;
    }
    public PhanSo(long tu, long mau){
        this.tu=tu;
        this.mau=mau;
    }
    public void setTu(long tu){
        this.tu=tu;
    }
    public void setMau(long mau){
        this.mau=mau;
    }
    public long getTu(){
        return tu;
    }
    public long getMau(){
        return mau;
    }
    public long USCLN(long a, long b){
        if(b == 0) return a;
        else return USCLN(b,a % b);
    }
    @Override
    public String toString(){
        return tu +"/"+mau;
    }
    public PhanSo RutGonPhanSo(){
        long bscnn = USCLN(tu , mau);
        long tumoi = tu;
        long maumoi = mau;
        tumoi /= bscnn;
        maumoi /= bscnn;
        return (new PhanSo(tumoi,maumoi));
    }
}
