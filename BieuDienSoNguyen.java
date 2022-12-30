/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi4;

/**
 *
 * @author Tuấn
 */
import java.util.*;
public class BieuDienSoNguyen {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int n = sc.nextInt();
        if(n <= 1){
            System.out.println("-1");
            return;
        }
        System.out.println(n/2); //So luong so hang
        if(n%2 == 0){
            for(int i=1;i<=n/2;i++){
                System.out.print(2+" ");
            }
        }
        else{
            for(int i=1;i<=n/2-1;i++){
                System.out.print(2+" ");
            }
            System.out.print("3");
        }
    }
}
