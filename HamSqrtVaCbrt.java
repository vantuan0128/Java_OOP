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
import java.util.Scanner;
public class HamSqrtVaCbrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.printf("%.2f",Math.sqrt(x));
        System.out.println();
        System.out.printf("%.3f",Math.cbrt(x));
    }
}
