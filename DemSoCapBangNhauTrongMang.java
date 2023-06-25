/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaSql13;

/**
 *
 * @author Tuấn
 */
import java.util.*;

public class DemSoCapBangNhauTrongMang {

    //Tim so lan xuat hien, ket qua la nC2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] cnt = new int[1000001];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            cnt[a[i]]++;
        }
        long ans = 0;
        for (int i = 1; i <= 1000000; i++) {
            if (cnt[i] != 0) {
                ans += 1l * (cnt[i]) * (cnt[i] - 1) / 2;
            }
        }
        System.out.println(ans);
    }
}
