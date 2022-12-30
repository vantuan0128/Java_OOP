/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3;

/**
 *
 * @author Tuấn
 */
import java.util.*;
public class DoiTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int ans = n/100;
        n %= 100;
        ans += n/20;
        n %= 20;
        ans += n/10;
        n %= 10;
        ans += n/5;
        n %= 5;
        ans += n;
        System.out.println(n);
    }
}
