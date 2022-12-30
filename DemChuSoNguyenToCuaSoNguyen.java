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
public class DemChuSoNguyenToCuaSoNguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long n = sc.nextLong();
        int dem=0;
        while(n>0){
            if(check((int)(n%10))) dem++;
            n /= 10;
        }
        System.out.println(dem);
    }
    public static boolean check(int n){
        if(n<2) return false;
        if(n==2) return true;
        if(n%2==0 && n!=2) return false;
        for(int i=3;i<=Math.sqrt(n);i+=2){
            if(n%i==0) return false;
        }
        return true;
    }
}
