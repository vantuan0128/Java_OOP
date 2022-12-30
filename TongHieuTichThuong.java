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
public class TongHieuTichThuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int tong = a + b;
        System.out.println(tong);
        int hieu = a - b;
        System.out.println(hieu);
        long tich = 1l * a * b;
        System.out.println(tich);
        if(b != 0){
            double thuong = (double) a / b;
            System.out.printf("%.4f",thuong);
        }
        else System.out.println("INVALID");
    }
}
