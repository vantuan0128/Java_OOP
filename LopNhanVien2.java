
package OOP_Part1;

import java.util.*;

public class LopNhanVien2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String ten = sc.nextLine();
        String gt = sc.nextLine();
        String ns = sc.nextLine();
        String qq = sc.nextLine();
        String so = sc.nextLine();
        String nk = sc.nextLine();
        Employer2 em2 = new Employer2(ten,gt,ns,qq,so,nk);
        em2.chuanHoa();
        System.out.println(em2);
    }
}

class Employer2{
    private String ten, gt, ns, qq, so, nk;

    public Employer2() {
    }

    public Employer2(String ten, String gt, String ns, String qq, String so, String nk) {
        this.ten = ten;
        this.gt = gt;
        this.ns = ns;
        this.qq = qq;
        this.so = so;
        this.nk = nk;
    }
    
    public void chuanHoa(){
        StringBuilder sb1 = new StringBuilder(ns);
        if (sb1.charAt(1) == '/') sb1.insert(0, "0");
        if (sb1.charAt(4) == '/') sb1.insert(3,"0");
        this.ns = sb1.toString();
        StringBuilder sb2 = new StringBuilder(nk);
        if (sb2.charAt(1) == '/') sb2.insert(0, "0");
        if (sb2.charAt(4) == '/') sb2.insert(3,"0");
        this.nk = sb2.toString();
        String[] s = ten.split("\\s+");
        String res = "";
        for (int i = 0; i < s.length; ++i){
            String tmp = "";
            for (int j = 0; j < s[i].length(); ++j){
                if (j == 0) tmp += Character.toUpperCase(s[i].charAt(j));
                else tmp += Character.toLowerCase(s[i].charAt(j));
            }
            res += tmp + " ";
        }
        res = res.substring(0, res.length() - 1);
        this.ten = res;
    }
    
    public String toString(){
        return "00001"+" "+ten+" "+gt+" "+ns+" "+qq+" "+so+" "+nk;
    }
}
