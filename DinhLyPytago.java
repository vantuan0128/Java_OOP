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

public class DinhLyPytago {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            a[i] *= a[i];
        }
        Arrays.sort(a);
        boolean ok = false;
        outer :for (int i = n - 1; i >= 2; i--) {
            int left = 0, right = n - 1;
            while (left < right) {
                if (a[left] + a[right] == a[i]) {
                    System.out.println("YES");
                    ok = true;
                    break outer;
                } else if (a[left] + a[right] < a[i]) {
                    ++left;
                } else {
                    --right;
                }
            }
        }
        if (!ok) {
            System.out.println("NO");
        }
    }
}
