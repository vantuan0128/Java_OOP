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
public class CapSoCong {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt(), u1=sc.nextInt(), d=sc.nextInt();
        long un = u1+ 1l*(n-1)*d;
        System.out.println(n*(u1+un)/2);
    }
}
