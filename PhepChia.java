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
public class PhepChia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int a = sc.nextInt();
        int c = (int) a/b;
        double d = (double) a/b;
        System.out.println(c);
        System.out.printf("%.2f",d);
    }
}
