/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3;

/**
 *
 * @author Tuấn
 */
import java.util.*;
public class DemSoLuongChuSoCuaN {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long n = sc.nextLong();
        long m = n ;
        int dem = 0;
        while(n > 0){
            n /= 10;
            dem++;
        }
        if(m == 0) System.out.println(1);
            else System.out.println(dem);
    }
}
