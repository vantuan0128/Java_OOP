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
public class DemChanLeTongChanLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        long [] a = new long[n];
        long tongChan=0,tongLe=0;
        long demChan=0,demLe=0;
        for(int i=0;i<n;i++){
            a[i]= sc.nextLong();
            if(a[i] % 2 == 1){
                demLe++;
                tongLe += a[i];
            }
            else{
                demChan++;
                tongChan += a[i];
            }
        }
        System.out.println(demChan);
        System.out.println(demLe);
        System.out.println(tongChan);
        System.out.println(tongLe);
    }
}
