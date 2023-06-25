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

public class TongNhoNhat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
        long s1 = 0, s2 = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                s1 = s1 * 10 + a[i];
            } else {
                s2 = s2 * 10 + a[i];
            }
        }
        System.out.println(s1 + s2);
    }
}
