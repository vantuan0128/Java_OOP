/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi6;

/**
 *
 * @author Tuấn
 */
import java.util.*;
public class Demuoccua1songuyenduong {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        long res = 1;
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            res *= b + 1;
            res %= 1000000007;
        }
        System.out.println(res);
    }
}
