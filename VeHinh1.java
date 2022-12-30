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
public class VeHinh1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1||j==1||i==n||j==n){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1||j==1||i==n||j==n){
                    System.out.print("*");
                }
                else System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1||j==1||i==n||j==n){
                    System.out.print(i+" ");
                }
                else System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
}
