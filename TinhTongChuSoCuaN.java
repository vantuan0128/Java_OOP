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
public class TinhTongChuSoCuaN {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long n = sc.nextLong();
        int sum=0;
        while(n > 0){
            sum += n%10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
