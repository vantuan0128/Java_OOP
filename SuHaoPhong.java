/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trogiangbuoi2;

/**
 *
 * @author Tuấn
 */
import java.util.*;
public class SuHaoPhong {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a,b,c,d,e;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();
        long tong = 1l*a+b+c+d+e;
        if(tong%5==0 && tong!=0)System.out.println(tong/5);
        else System.out.println("-1");
    }
}
