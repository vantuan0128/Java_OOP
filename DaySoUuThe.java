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

public class DaySoUuThe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int[] a = new int[100000];
        int chan = 0, le = 0;
        while (sc.hasNext()) {
            int tmp = sc.nextInt();
            if (tmp % 2 == 0) {
                ++chan;
            } else {
                ++le;
            }
            a[n] = tmp;
            ++n;
        }
        if ((n % 2 == 0 && chan > le) || (n % 2 == 1 && le > chan)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
