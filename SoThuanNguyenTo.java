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
public class SoThuanNguyenTo {
    public static boolean SNT(int n){
        if(n<2) return false;
        if(n==2) return true;
        if(n%2==0&&n!=2) return false;
        for(int i=3;i<=Math.sqrt(n);i+=2){
            if(n%i==0) return false;
        }
        return true;
    }
    public static boolean check(int n){
        while(n>0){
            int m = n%10;
            if(m!=2&&m!=3&&m!=5&&m!=7) return false;
            n /= 10;
        }
        return true;
    }
    public static int tong(int n){
        int m=0;
        while(n>0){
            m += n%10;
            n /= 10;
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int dem=0;
        for(int i=a;i<=b;i++){
            if(check(i)&&SNT(tong(i))&&SNT(i)) dem++;
        }
        System.out.println(dem);
    }
}
