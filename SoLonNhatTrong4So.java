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
public class SoLonNhatTrong4So {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long a=sc.nextLong(),b=sc.nextLong();
        long c=sc.nextLong(),d=sc.nextLong();
        System.out.println(Math.min(Math.min(a,b), Math.min(c,d)));
    }
}
