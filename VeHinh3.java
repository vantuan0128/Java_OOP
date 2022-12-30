/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi5;

/**
 *
 * @author Tuấn
 */
import java.util.*;
public class VeHinh3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dem=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(dem+" ");
                ++dem;
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1;i<=n;i++){
            int khoiTao=i;
            for(int j=1;j<=n;j++){
                System.out.print(khoiTao+" ");
                khoiTao++;
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=n-i) System.out.print("~");
                else System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1;i<=n;i++){
            int khoiTao=i;
            int gap=n-1;
            for(int j=1;j<=i;j++){
                System.out.print(khoiTao+" ");
                khoiTao += gap;
                -- gap;
            }
            System.out.println();
        }
    }
}
