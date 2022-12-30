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
public class TinhGiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        long giaithua = 1;
        for(int i=1;i<=n;i++){
            giaithua *= 1l*i;
        }
        System.out.println(giaithua);
    }
}
