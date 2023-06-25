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

public class ChiaMang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int res = Math.max(k, n - k);
        Arrays.sort(a, Collections.reverseOrder());
        long sum = 0;
        for (int i = 0; i < res; i++) {
            sum += a[i];
        }
        long tmp = 0;
        for (int i = res; i < n; i++) {
            tmp += a[i];
        }
        System.out.println(sum - tmp);
    }
}
