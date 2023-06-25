/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaSql6;

/**
 *
 * @author Tuấn
 */
import java.util.*;

public class LuyThuaNhiPhan {
    public static long pow(long a, long b) {
        long res = 1;
        while (b != 0) {
            if (b % 2 == 1) {
                res *= a;
            }
            b /= 2;
            a *= a;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(pow(2,10));
    }
}
