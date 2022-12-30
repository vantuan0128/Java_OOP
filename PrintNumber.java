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
public class PrintNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        long y=sc.nextLong();
        sc.nextLine(); //Chong troi lenh
        char c=sc.nextLine().charAt(0);
        float f=sc.nextFloat();
        double d=sc.nextDouble();
        System.out.println(x);
        System.out.println(y);
        System.out.println(c);
        System.out.printf("%.2f\n",f);
        System.out.printf("%.9f\n",d);
    }
}
