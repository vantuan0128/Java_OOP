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
public class InPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int []a = new int [n];
        int ok=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(i%2==0&&a[i]%2==0){
                ok=1;
                System.out.print(a[i]+" ");
            }
        }
        if(ok==0) System.out.println("NONE");
    }
}
