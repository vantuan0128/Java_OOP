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
public class HPNY {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int h =sc.nextInt();
        int m = sc.nextInt();
        System.out.println(1440-h*60-m);
    }
}
