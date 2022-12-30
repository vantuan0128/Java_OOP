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
public class DoremonLeoCauThang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(), m=sc.nextInt();
        int minStep = n/2, maxStep=n;
        if(n%2==1) ++minStep;
        int ans = (minStep + m - 1)/ m * m;
        if(ans<=maxStep) System.out.println(ans);
        else System.out.println("-1");
    }
}
