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

public class SoBiLapDauTien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] cnt = new int[1000001];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (cnt[a[i]] != 0) {
                System.out.println(a[i]);
                return;
            }
            cnt[a[i]] = 1;
        }
        System.out.println("-1");
    }
}
