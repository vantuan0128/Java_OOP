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
public class KiemTraSo2022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int a[] = new int[10000];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        if(check(a,n,2022)) System.out.println("YES");
        else System.out.println("NO");
    }
    public static boolean check(int a[],int n,int m){
        for(int i=0;i<n;i++){
            if(a[i]==m) return true;
        }
        return false;
    }
}
