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
public class KhoangcachEuclid {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        if((x1==x2&&x1==y1&&x1==y2)) System.out.println("0.00");
        else{
           double kc = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
            System.out.printf("%.2f",kc);
        }
    }
}
