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

public class TruyVanTongTrenDoan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        long[] pre = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (i == 0) {
                pre[i] = a[i];
            } else {
                pre[i] = pre[i - 1] + a[i];
            }
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt(), r = sc.nextInt();
            --l; --r;
            if (l == 0) {
                System.out.println(pre[r]);
            } else {
                System.out.println(pre[r] - pre[l - 1]);
            }
        }
    }
}
