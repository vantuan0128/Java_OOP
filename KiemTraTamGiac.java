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
public class KiemTraTamGiac {
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a+b<=c || a+c<=b || b+c<=a) System.out.println("INVALID");
        else{
            if(a==b && a==c) System.out.println("1");
            else if(a==b || a==c || b==c) System.out.println("2");
            else if(a == Math.sqrt(Math.pow(b,2)+Math.pow(c,2)) ||
                        b == Math.sqrt(Math.pow(a,2)+Math.pow(c,2)) ||
                            c == Math.sqrt(Math.pow(a,2)+Math.pow(b,2)) ){
                System.out.println("3");
            }
            else if(a+b>c && b+c>a && a+c>b) System.out.println("4");
        }
    }
}
