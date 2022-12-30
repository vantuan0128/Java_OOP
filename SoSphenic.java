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
public class SoSphenic {
    public static boolean check(long n){
        int dem=0,mu=0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                dem++;
                while(n%i==0){
                    mu++;
                    n /= i;
                    if(mu >= 2) return false;
                }
            }
            mu = 0;
        }
        if(n>1) dem++;
        return dem==3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long n = sc.nextLong();
        if(check(n)) System.out.println("1");
        else System.out.println("0");
    }
}
