/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3;

/**
 *
 * @author Tuấn
 */
import java.util.*;
public class TongChan {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int a[] = new int[100001];
        long sum = 0;
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
            if(a[i]%2==0) sum += a[i];
        }
        System.out.println(sum);
    }
}
