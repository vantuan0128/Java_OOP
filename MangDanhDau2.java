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
public class MangDanhDau2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        int []mark = new int[1000001];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            mark[a[i]]++;
        }
        for(int i=0;i<1000001;i++){
            if(mark[i]!=0){
                System.out.print(i+" "+mark[i]);
                System.out.println();
                mark[i]=0;
            }
        }
    }
}
