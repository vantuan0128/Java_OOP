/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaSql17;

/**
 *
 * @author Tuấn
 */
import java.util.*;

class PhuongTien {

    private String ma, ten, hang, mauSac;
    private int giaBan;

    public PhuongTien(String ma, String ten, String hang, String mauSac, int giaBan) {
        this.ma = ma;
        this.ten = ten;
        this.hang = hang;
        this.mauSac = mauSac;
        this.giaBan = giaBan;
    }

    public int getGiaBan() {
        return this.giaBan;
    }

    public String getHang() {
        return this.hang;
    }

    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.hang + " " + this.mauSac;
    }
}

class Oto extends PhuongTien {

    private int maLuc;

    public Oto(int maLuc, String ma, String ten, String hang, String mauSac, int giaBan) {
        super(ma, ten, hang, mauSac, giaBan);
        this.maLuc = maLuc;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.maLuc + " " + super.getGiaBan();
    }
}

class XeMay extends PhuongTien {

    private int tocDo;

    public XeMay(int tocDo, String ma, String ten, String hang, String mauSac, int giaBan) {
        super(ma, ten, hang, mauSac, giaBan);
        this.tocDo = tocDo;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.tocDo + " " + super.getGiaBan();
    }
}

public class Vehicle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<PhuongTien> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String hang = sc.nextLine();
            String mau = sc.nextLine();
            int tmp = Integer.parseInt(sc.nextLine());
            int gia = Integer.parseInt(sc.nextLine());
            if (ma.substring(0, 2).equals("XM")) {
                XeMay xeMay = new XeMay(tmp, ma, ten, hang, mau, gia);
                arr.add(xeMay);
            } else {
                Oto oTo = new Oto(tmp, ma, ten, hang, mau, gia);
                arr.add(oTo);
            }
        }
        String hangXe = sc.nextLine();
        System.out.println("DANH SACH HANG XE " + hangXe + " :");
        for (PhuongTien x : arr) {
            if (x.getHang().equals(hangXe)) {
                System.out.println(x);
            }
        }
    }
}
