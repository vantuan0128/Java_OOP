/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi8;

/**
 *
 * @author Tuấn
 */
import java.util.*;
public class TinhTongVaTichCacPhanTu {
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        int mod = 1000000007;
        long tong = 0;
        long tich = 1;
        for(int i=0;i<n;i++){
            tong += (long)a[i];
            tong %= mod;
            tich *= (long)a[i];
            tich %= mod;
        }
        System.out.println(tong);
        System.out.println(tich);
    }
}
