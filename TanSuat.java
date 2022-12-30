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
public class TanSuat {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] a = new int [n];
        int [] fre = new int[1001];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            fre[a[i]]++;
        }
        for(int i=0;i<n;i++){
            if(fre[a[i]]!=0){
                System.out.print(a[i]+" "+fre[a[i]]);
                System.out.println();
                fre[a[i]]=0;
            }
        }
    }
}
