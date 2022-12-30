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
public class Sofibo1 {
    public static long fibo(int n){
        if(n==1) return 0;
        if(n==2) return 1;
        long f1=1,f2=0,fn=0;
        for(int i=3;i<=n;i++){
            fn = f2 + f1;
            fn %= 1000000007;
            f2 = f1;
            f1 = fn;
        }
        return fn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
}
