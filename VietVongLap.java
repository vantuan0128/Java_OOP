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
public class VietVongLap {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) System.out.print(i+" ");
        System.out.println();
        for(int i=n;i>=0;i--) System.out.print(i+" ");
        System.out.println();
        for(int i=0;i<=n;i++){
            if(i%2==0) System.out.print(i+" ");
            else continue;
        }
        System.out.println();
        for(int i=0;i<=n;i++){
            if(i%2==1) System.out.print(i+" ");
            else continue;
        }
        System.out.println();
        for(int i=0;i<n;i++){
            if(i%4==0) System.out.print(i+" ");
            else continue;
        }
        System.out.println();
        for(int i=1;i<=n;i++){
            System.out.print((char)('a'+i-1));
            System.out.print(" ");
        }
        System.out.println();
        for(int i=n;i>=1;i--){
            System.out.print((char)('z'-i+1));
            System.out.print(" ");
        }
        System.out.println();
    }
}
