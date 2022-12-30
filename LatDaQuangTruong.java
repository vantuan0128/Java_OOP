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
public class LatDaQuangTruong {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n =sc.nextInt(), m=sc.nextInt();
        int a = sc.nextInt();
        int x=0,y=0;
        if(n % a == 0){
            x = n / a;
        }
        else x = n / a +1;
        if(m % a == 0){
            y = m / a;
        }
        else{
            y = m / a + 1;
        }
        System.out.println(1l * x * y);
    }
}
