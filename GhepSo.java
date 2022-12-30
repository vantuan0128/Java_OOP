/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trogiangbuoi2;

/**
 *
 * @author Tuấn
 */
import java.util.*;
public class GhepSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int k2=sc.nextInt();
        int k3=sc.nextInt();
        int k5=sc.nextInt();
        int k6=sc.nextInt();
        int min256 = Math.min(Math.min(k2,k5),k6);
        int min32 = Math.min(k3,Math.max(0,k2-min256));
        System.out.println((long)256 * min256 + (long)32 * min32);
    }
}
