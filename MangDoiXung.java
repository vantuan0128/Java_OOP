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
public class MangDoiXung {
    public static boolean check(int a[], int n){
        for(int i=0;i<n;i++){
            if(a[i]!=a[n-i-1]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        if(check(a,n)) System.out.println("YES");
        else System.out.println("NO");
    }
}
