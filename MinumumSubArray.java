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

public class MinumumSubArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        HashMap<Long, Long> map = new HashMap<>();
        long sum = 0;
        long ans = (long) 1e9;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            if (sum == k) {
                ans = Math.min(ans, i + 1);
            }
            if (map.containsKey(sum - k)) {
                ans = Math.min(ans, i - map.get(sum - k));
            }
            map.put(sum, 0l + i);
        }
        if (ans == 1e9) {
            System.out.println("-1");
        } else {
            System.out.println(ans);
        }
    }
}
