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
public class ChiaTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a,b,c,n;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        n=sc.nextInt();
        long tong = 1l * a + b + c + n;
        if(tong%3==0 && tong/3>=a && tong/3>=b && tong/3>=c){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
