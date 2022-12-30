/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi1;

/**
 *
 * @author Tuấn
 */
import java.util.*;
public class ChuSoCuoiCungva2ChuSoCuoiCung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int m = (int) (n%10);
        System.out.println(m);
        n /= 10;
        if(n%10 != 0) System.out.println(n%10 + "" + m);
        else System.out.println(m);
        
    }
}
