/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3;
import java.util.*;
/**
 *
 * @author Tuấn
 */
public class Domino {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n =sc.nextInt(), m =sc.nextInt();
        if(n%2==0){
            System.out.println(1l * n / 2 * m);
        }
        else{
            System.out.println(1l*(n-1)/2*m + m/2 );
        }
    }
}
