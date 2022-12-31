package OOP_Part1;

import java.util.*;

public class LopPhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long tu = sc.nextLong();
        long mau = sc.nextLong();
        PhanSo p = new PhanSo(tu,mau);
        p.rutGon();
        System.out.println(p);
    }
}

class PhanSo{
    private long tu,mau;

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public PhanSo() {
    }
    
    public long getTu() {
        return tu;
    }

    public void setTu(long tu) {
        this.tu = tu;
    }

    public long getMau() {
        return mau;
    }

    public void setMau(long mau) {
        this.mau = mau;
    }
    
    public String toString(){
        return tu+"/"+mau;
    }
    
    public long USCLN(long tu, long mau){
       if(mau==0) return tu;
       else return USCLN(mau,tu%mau);
    }
    
    public void rutGon(){
        long m = USCLN(tu,mau);
        tu /= m;
        mau /= m;
    }
}
