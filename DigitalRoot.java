/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi4;

/**
 *
 * @author Tuấn
 */
import java.util.*;
public class DigitalRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long n = sc.nextLong();
        while( n >= 10 ){
            //Tinh tong chu so cua n
            int sum = 0;
            while(n != 0){
                sum += (int)(n%10);
                n /= 10;
            }
            n = sum;
        }
        System.out.println(n);
    }
}
