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

public class ToHop {
    //Tinh to hop chap k cua n
    public static long toHop(int n, int k){
        long res = 1;
        k = Math.min(k,n-k);
        for(int i=1; i <= k; i++){
            res *= (n - i + 1);
            res /= i;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(toHop(10,3));
    }
}
