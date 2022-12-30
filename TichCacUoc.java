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
public class TichCacUoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        long tich = 1;
        for(int i=1; i<= Math.sqrt(n); i++){
            if(n%i==0){
                tich *= 1l * i; 
            }
            if(n%(n/i)==0 && i!=n/i){
                tich *= 1l * n/i;
            }
        }
        System.out.println(tich);
    }
}
