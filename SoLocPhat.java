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
public class SoLocPhat {
    public static boolean check(long n){
        while(n>0){
            long m = n % 10;
            if(m!=0 && m!=6 && m!=8) return false;
            n /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long n = sc.nextInt();
        if(check(n)) System.out.println(1);
        else System.out.println(0);
    }
}
