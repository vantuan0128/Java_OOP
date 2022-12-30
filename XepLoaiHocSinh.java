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
public class XepLoaiHocSinh {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double diem = (double)(a + b + c*2 + d*3)/7;
        if(diem < 5.0) System.out.println("YEU");
        else if(diem >= 5.0 && diem < 6.5) System.out.println("TRUNG BINH");
        else if(diem >= 6.5 && diem < 8.0) System.out.println("KHA");
        else System.out.println("GIOI");
    }
}
