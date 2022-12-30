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
public class MangDanhDau3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        int []mark = new int[1000001];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            mark[a[i]]++;
        }
        for(int i=0;i<n;i++){
            if(mark[a[i]]!=0){
                System.out.println(a[i]+" "+mark[a[i]]);
                mark[a[i]]=0;
            }
        }
    }
}
