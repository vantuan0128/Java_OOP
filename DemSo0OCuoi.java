/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi7;

/**
 *
 * @author Tuấn
 */
import java.util.*;
public class DemSo0OCuoi {
    public static long Legendre(long n, long p){
        long ans=0;
        for(long i=p;i<=n;i*=p){
            ans += n/i;
            ans %= 100000007;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long n = sc.nextLong();
        System.out.println(Legendre(n,5));
    }
}
