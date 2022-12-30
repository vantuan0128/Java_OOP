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
public class LietKeSoChinhPhuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long n = sc.nextLong();
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(1l* Math.pow(i,2) <= n) System.out.print((long)Math.pow(i,2)+" ");
        }
    }
}
