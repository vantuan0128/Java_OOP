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

public class ViTriDauTienVaCuoiCung {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int d = -1, c = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == k) {
                c = i + 1;
                if (d == -1) {
                    d = i + 1;
                }
            }
        }
        System.out.println(d + " " + c);
    }

}
