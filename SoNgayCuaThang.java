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
public class SoNgayCuaThang {
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
        if(t <= 0 || t > 12 || n <= 0) System.out.println("INVALID");
        else if(t==1||t==3||t==5||t==7||t==8||t==10||t==12) System.out.println(31);
        else if(t == 4 || t == 6 || t == 9 || t == 11) System.out.println(30);
        else if(t == 2 && ktNamNhuan(n) == true) System.out.println(29);
        else if(t == 2 && ktNamNhuan(n) == false) System.out.println(28);
    }
    public static boolean ktNamNhuan(int n){
        if(n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) return true;
        else return false;
    }
}
