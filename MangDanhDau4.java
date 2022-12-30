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
public class MangDanhDau4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int []a = new int [n];
        int maxVal=0;
        int []cnt=new int[1000001];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            cnt[a[i]]++;
            maxVal = Math.max(maxVal,a[i]);
        }
        int tanSuat=0,res=0;
        for(int i=0;i<=maxVal;i++){
            if(cnt[i]>tanSuat){
                tanSuat=cnt[i];
                res=i;
            }
        }
        System.out.println(res+" "+tanSuat);
    }
}
