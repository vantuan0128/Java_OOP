/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi8;

/**
 *
 * @author Tuấn
 */
import java.util.*;
public class LietKe {
    public static boolean check1(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return n>1;
    }
    public static boolean check2(int n){
        int m=n;
        int somoi=0;
        while(n>0){
            somoi = somoi*10 + n%10;
            n/=10;
        }
        if(somoi==m) return true;
        else return false;
    }
    public static boolean check3(int n){
        double k =  Math.sqrt(n);
        if((int)k*k==n) return true;
        else return false;
    }
    public static boolean check4(int n){
        int tong=0;
        while(n>0){
            tong += n%10;
            n/=10;
        }
        if(check1(tong)) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        int dem1=0,dem2=0,dem3=0,dem4=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(check1(a[i])) dem1++;
            if(check2(a[i])) dem2++;
            if(check3(a[i])) dem3++;
            if(check4(a[i])) dem4++;
        }
        System.out.println(dem1);
        System.out.println(dem2);
        System.out.println(dem3);
        System.out.println(dem4);
    }
}
