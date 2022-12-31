package OOP_Part1;

import java.util.*;

public class BaiTapSoPhuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
            SoPhuc x = new SoPhuc(a,b);
            SoPhuc y = new SoPhuc(c,d);
            SoPhuc res1 = x.mul(y);
            SoPhuc res2 = x.pow(y);
            System.out.print(res1 + ", " +  res2);
            System.out.println();
        }
    }
}

class SoPhuc{
    int thuc, ao;

    public SoPhuc() {
    }

    public SoPhuc(int thuc, int ao) {
        this.ao = ao;
        this.thuc = thuc;
    }

    public SoPhuc mul (SoPhuc other){
        int a = this.thuc * this.thuc - this.ao * this.ao - this.ao * other.ao + this.thuc * other.thuc;
        int b = 2 * this.thuc * this.ao + this.thuc * other.ao + other.thuc * this.ao;
        SoPhuc res = new SoPhuc(a,b);
        return res;
    }

    public SoPhuc pow (SoPhuc other){
        int a = (this.thuc + other.thuc) * (this.thuc + other.thuc) - (this.ao + other.ao) * (this.ao + other.ao);
        int b = 2 * (this.thuc + other.thuc) * (this.ao + other.ao);
        SoPhuc res = new SoPhuc(a,b);
        return res;
    }

    @Override
    public String toString() {
        String res = "";
        if (this.ao < 0) return this.thuc + " - " + Math.abs(this.ao) + 'i';
        if (this.ao == 0) return this.thuc + "";
        return this.thuc + " + " + this.ao + "i";
    }
}