
package buoi1;

import java.util.Scanner;
public class ChuViVaDienTichHinhTron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double chuVi = (double) 2 * 3.14 * n;
        double DienTich =(double) 3.14 * Math.pow(n,2);
        System.out.printf("%.4f",chuVi);
        System.out.print(" ");
        System.out.printf("%.4f",DienTich);
    }
}
