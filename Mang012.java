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

public class Mang012 {

    //Counting Sort
    public static int[] cnt = new int[3];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            cnt[a[i]]++;
        }
        for (int i = 0; i < 3; i++) {
            if (cnt[i] != 0) {
                for (int j = 0; j < cnt[i]; j++) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
