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
public class LonHonNhoHon {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int lon=0,nho=0;
        int x = sc.nextInt();
        for(int i=0;i<n;i++){
            if(a[i]<x) nho++;
            else if(a[i]>x) lon++;
        }
        System.out.println(nho);
        System.out.println(lon);
    }
}
