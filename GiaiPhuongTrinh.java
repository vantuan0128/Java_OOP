/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi4;

/**
 *
 * @author Tuấn
 */
import java.util.*;
public class GiaiPhuongTrinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        for(int x=0;x<=n/a;x++){
            int remain = n - a*x;
            if(remain%b==0){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
