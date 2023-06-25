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

public class SNTLonNhatChiaHetPMuX {
    public static long solve(int n, int p) {
        long res = 0;
        for(int i = p; i <= n; i += p) {
            //Phan tich xem trong boi cua p co bao nhieu so
            int tmp = i;
            while( tmp % p == 0) {
                ++res;
                tmp /= p;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println(solve(10,2));
    }
}
