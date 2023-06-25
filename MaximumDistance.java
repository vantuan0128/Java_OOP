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

public class MaximumDistance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(a[i] + k)) {
                ans = Math.max(ans, i - map.get(a[i] + k));
            }
            if (map.containsKey(a[i] - k)) {
                ans = Math.max(ans, i - map.get(a[i] - k));
            }
            if (!map.containsKey(a[i])) {
                map.put(a[i], i);
            }
        }
        if (ans == -1) {
            System.out.println("-1");
        } else {
            System.out.println(ans);
        }
    }
}
