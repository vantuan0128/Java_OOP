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

public class SoThaoTacGiupMangTangDan2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), d = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        long ans = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] <= a[i - 1]) {
                long tmp = a[i - 1] - a[i] + 1;
                long q;
                if (tmp % d == 0) {
                    q = tmp / d;
                } else {
                    q = tmp / d + 1;
                }
                ans += q;
                a[i] += q * d;
            }
        }
        System.out.println(ans);
    }
}
