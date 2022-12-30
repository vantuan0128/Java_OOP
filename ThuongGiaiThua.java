/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi5;

/**
 *
 * @author Tuấn
 */
import java.util.*;
public class ThuongGiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for(int i=0;i<n;i++){
            sum += (double) 1/(long)giaiThua(i);
        }
        System.out.printf("%.4f",sum);
    }
    public static long giaiThua(int n){
        if(n==0||n==1) return 1;
        return n*giaiThua(n-1);
    }
}
