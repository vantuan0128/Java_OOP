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
public class MuaBia {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int bia = n/28;
        int sonapchai = n/28;
        while(sonapchai >= 3){
            bia += 1;
            sonapchai -= 3;
            sonapchai += 1;
        }
        System.out.println(bia);
    }
}
