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
public class DuongDiNganNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int d1=sc.nextInt(),d2=sc.nextInt(),d3=sc.nextInt();
        int kc1 = d1+d2+d3, kc2=2*(d1+d2), kc3=2*(d2+d3),kc4=2*(d1+d3);
        System.out.println(Math.min(Math.min(kc1,kc2),Math.min(kc3,kc4)));
    }
}
