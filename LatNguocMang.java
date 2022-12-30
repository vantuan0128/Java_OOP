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
public class LatNguocMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int i=n-1;i>=0;i--) System.out.print(a[i]+" ");
    }
}
