/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi9;

/**
 *
 * @author Tuấn
 */
import java.util.*;
public class SoLonNhatVaLonThuHai {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max1 = (int)-1e9, max2 = (int)-1e9;
        for(int i=0;i<n;i++){
            if(a[i]  > max1){
                max2=max1;
                max1=a[i];
            }
            else if(a[i] > max2){
                max2 = a[i];
            }
        }
        System.out.println(max1);
        System.out.println(max2);
    }
}
