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

public class SoThaoTacGiupMangTangDan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        long res = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] <= a[i - 1]) {
                int tmp = a[i - 1] - a[i] + 1;
                a[i] = a[i] + tmp;
                res += tmp;
            }
        }
        System.out.println(res);
    }
}
