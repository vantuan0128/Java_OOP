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
public class Frog {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a=sc.nextInt(), b=sc.nextInt(), k=sc.nextInt();
        int k1=k/2,k2=k/2;
        if(k%2==1) k1 += 1;
        System.out.println(1l * k1 * a - 1l * k2 * b);
    }
}
