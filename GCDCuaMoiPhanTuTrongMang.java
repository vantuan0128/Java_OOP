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
public class GCDCuaMoiPhanTuTrongMang {
    public static long GCD(long a, long b){
        if(b==0) return a;
        return GCD(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        long [] a = new long[n];
        for(int i=0;i<n;i++) a[i]=sc.nextLong();
        long res=GCD(a[0],a[1]);
        for(int i=2;i<n;i++){
            res = GCD(res,a[i]);
        }
        System.out.println(res);
    }
}
