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
public class ViTriSoLonNhatNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        int lon = -1000000000;
        int nho =  1000000000;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            lon = Math.max(lon,a[i]);
            nho = Math.min(nho,a[i]);
        }
        for(int i = n-1; i>=0; i--){
            if(nho == a[i]){
                System.out.print(i);
                break;
            }
        }
        System.out.print(" ");
        for(int i = 0; i<n; i++){
            if(lon==a[i]){
                System.out.print(i);
                break;
            }
        }
    }
}
