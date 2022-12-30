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
public class CapSoNhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
        int q;
        if(b%a==0){
            q = b / a;
            if(b*q==c && c*q==d) System.out.println("YES");
            else System.out.println("NO");
        }
        else System.out.println("NO");
    }
}
