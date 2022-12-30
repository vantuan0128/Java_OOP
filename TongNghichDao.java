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
public class TongNghichDao {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        double sum = 0d;
        for(int i=1;i<=n;i++){
            sum += 1.0d*1/i;
        }
        System.out.printf("%.3f",sum);
    }
}
