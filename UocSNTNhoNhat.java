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
public class UocSNTNhoNhat {
    public static int pt(int n){
        int m=n;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                while(n%i==0){
                    n /= i;
                }
                return i;
            }
        }
        if(n==m) return n;
        else return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(pt(i));
        }
    }
}
