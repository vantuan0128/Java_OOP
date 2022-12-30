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
public class DongXu {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long n=sc.nextLong(), S=sc.nextLong();
        if(S%2==0) System.out.println(S/n);
        else System.out.println(S/n + 1);
    }
}
