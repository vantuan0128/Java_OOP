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

public class MaximumPair {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int res = -1000000001;
        for (int i = 1; i < n; i++) {
            int tmp = Math.abs(a[i] + a[i - 1]);
            if (res < tmp) {
                res = tmp;
            }
        }
        System.out.println(res);
    }
}
