
package OOP_Part1;

import java.util.*;

public class LopNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String ten = sc.nextLine();
        String gt = sc.nextLine();
        String ns = sc.nextLine();
        String qq = sc.nextLine();
        String so = sc.nextLine();
        String nk = sc.nextLine();
        Employer em = new Employer(ten,gt,ns,qq,so,nk);
        System.out.println(em);
    }
}

class Employer{
    private String ten, gt, ns, qq, so, nk;

    public Employer() {
    }

    public Employer(String ten, String gt, String ns, String qq, String so, String nk) {
        this.ten = ten;
        this.gt = gt;
        this.ns = ns;
        this.qq = qq;
        this.so = so;
        this.nk = nk;
    }
    
    public String toString(){
        return "00001"+" "+ten+" "+gt+" "+ns+" "+qq+" "+so+" "+nk;
    }
}
