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
public class SoNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] a =new int[n];
        int min1=10000;
        int dem=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            min1=Math.min(min1,a[i]);
        }
        for(int i=0;i<n;i++){
            if(a[i]==min1) dem++;
        }
        System.out.println(dem);
    }
}
