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
public class PhanTichThuaSoNguyenTo {
    public static void factorize(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                while(n % i == 0){
                    System.out.print(i+" ");
                    n /= i;
                }
            }
        }
        //Xu ly thua snt cuoi cung co so mu la 1
        if(n > 1) System.out.print(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        factorize(n);
    }
}
