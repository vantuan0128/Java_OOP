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

public class BRT {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int res = Integer.MAX_VALUE, cnt = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] - a[i - 1] < res) {
                res = a[i] - a[i - 1];
                cnt = 1;
            } else if (a[i] - a[i - 1] == res) {
                ++cnt;
            }
        }
        System.out.println(res + " " + cnt);
    }
}
