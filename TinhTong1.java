/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi9;

/**
 *
 * @author Tuấn
 */
import java.util.*;
public class TinhTong1 {
    public static long tong(int n){
        if(n==1) return 1;
        return n + tong(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        System.out.println(tong(n));
    }
}
