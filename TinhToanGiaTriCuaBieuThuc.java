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
public class TinhToanGiaTriCuaBieuThuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x == 0) System.out.println(1);
        else{
            long res = (long) ((long)Math.pow(x,3) + 3*Math.pow(x,2) + x + 1);
            System.out.println(res);
        }
    }
}
