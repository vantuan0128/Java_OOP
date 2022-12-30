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
public class UocChungLonNhatCuaGiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        if(a<b) System.out.println(giaithua(a));
        else System.out.println(giaithua(b));
    }
    public static long giaithua(long a){
        if(a==0 || a==1) return 1;
        return a * giaithua(a-1);
    }
}
