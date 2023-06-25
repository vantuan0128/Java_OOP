/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaSql13;

/**
 *
 * @author Tuấn
 */
import java.util.*;

public class TimHopVaGiao2Mang2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int [] a = new int[n];
        int [] b = new int[m];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        for(int i=0;i<m;i++) b[i] = sc.nextInt();
        ArrayList<Integer> giao = new ArrayList<>();
        ArrayList<Integer> hop = new ArrayList<>();
        int i=0,j=0;
        while(i < n && j < m){
            if (a[i] == b[j]){
                giao.add(a[i]);
                hop.add(a[i]);
                i++;j++;
            }
            else if(a[i] < b[j]){
                hop.add(a[i]); i++;
            }
            else{
                hop.add(b[j]); j++;
            }
        }
        while(i < n){
            hop.add(a[i]); i++;
        }
        while(j < m){
            hop.add(b[j]); j++;
        }
        for(int x : hop) System.out.print(x+" ");
        System.out.println("");
        for(int x : giao) System.out.println(x+" ");
    }
}
