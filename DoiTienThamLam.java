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

public class DoiTienThamLam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        int[] a = {1000,500,200,100,50,20,10,5,2,1};
        long ans = 0;
        for(int x : a){
            ans += n / x;
            n %= x;
        }
        System.out.println(ans);
    }
}
