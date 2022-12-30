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
public class TimChuSoDauTienCuaSoNguyen {
    public static long tachSo(long n){
        if(n < 10) return n;
        else return tachSo(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long n = sc.nextLong();
        System.out.println(tachSo(n));
    }
}
