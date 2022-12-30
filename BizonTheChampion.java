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
public class BizonTheChampion {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a1= sc.nextInt();
        int a2= sc.nextInt();
        int a3= sc.nextInt();
        int b1= sc.nextInt();
        int b2= sc.nextInt();
        int b3= sc.nextInt();
        int n = sc.nextInt();
        int tonga = a1+a2+a3;
        int tongb = b1+b2+b3;
        int ka = 0,kb = 0;
        if(tonga % 5 == 0) ka = tonga/5;
        else ka = tonga/5 + 1;
        if(tongb % 10 == 0) kb = tongb/10;
        else kb = tongb/10 + 1;
        if(ka + kb <= n) System.out.println("YES");
        else System.out.println("NO");
    }
}
