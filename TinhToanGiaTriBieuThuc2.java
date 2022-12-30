/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi1;

/**
 *
 * @author Tuấn
 */
import java.util.*;
public class TinhToanGiaTriBieuThuc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        if(a==0 && b==0 && c==0) System.out.println(0);
        else if(a==0 && b==0) System.out.println(0);
        else if(a==0 && c==0) System.out.println((long)a*b);
        else if(b==0 && c==0) System.out.println(0);
        else if(a==0) System.out.println((long) b*c);
        else if(b==0) System.out.println((long) a*c);
        else if(c==0) System.out.println((long)2*a*b);
        else System.out.println((long)(1l*a*(b+c)+1l*b*(a+c)));
    }
}
