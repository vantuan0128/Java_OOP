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

public class DayConDaiNhatCacPhanTuLienKeKhacNhau {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int cnt = 1, res = 0;
        long sum = 0, tmp = a[0];
        int ind = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] != a[i - 1]) {
                ++cnt;
                tmp += a[i];
            } else {
                cnt = 1;
                tmp = a[i];
            }
            if (res < cnt) {
                res = cnt;
                sum = tmp;
                ind = i;
            } else if (res == cnt) {
                if (sum < tmp) {
                    sum = tmp;
                    ind = i;
                }
            }
        }
        System.out.println(res);
        for (int j = ind - res + 1; j <= ind; j++) {
            System.out.print(a[j] + " ");
        }
    }
}
