/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trogiangbuoi3;

/**
 *
 * @author Tuấn
 */
import java.util.*;
public class KiemtraSNT {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        if(check(n)) System.out.println("YES");
        else System.out.println("NO");
    }
    public static boolean check(int n){
        if(n<2) return false;
        if(n==2) return true;
        if(n%2==0 && n!=2) return false;
        for(int i=3;i<=Math.sqrt(n);i+=2){
                if(n%i==0) return false;
        }
        return true;
    }
}
