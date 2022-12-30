/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3;
import java.util.Scanner;
/**
 *
 * @author Tuấn
 */
public class TongBoiCua3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        long sum = 0;
        for(int i=1;i<=n;i++){
            if(i%3 == 0) sum += i;
        }
        System.out.println(sum);
    }
}
