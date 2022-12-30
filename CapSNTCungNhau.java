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
public class CapSNTCungNhau {
    public static int GCD(int a, int b){
        if(b==0) return a;
        return GCD(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=a;i<b;i++){
            for(int j=i+1;j<=b;j++){
                if(GCD(i,j)==1){
                    System.out.print("("+i+","+j+")");
                    System.out.println();
                }
            }
        }
    }
}
