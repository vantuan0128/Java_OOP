/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trogiangbuoi3;

/**
 *
 * @author Tuấn
 */
import java.util.*;
public class T_Prime_2 {
    public static boolean SNT(long n){
        if(n<2) return false;
        if(n==2) return true;
        if(n%2==0&&n!=2) return false;
        for(int i=3;i<=Math.sqrt(n);i+=2){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int dem=0;
        long n = sc.nextLong();
        for(long i=2;i<=Math.sqrt(n);i++){
            if(SNT(i)) dem++;
        }
        System.out.println(dem);
    }
}
