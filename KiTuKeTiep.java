/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2;

/**
 *
 * @author Tuấn
 */
import java.util.*;
public class KiTuKeTiep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);
        if(c>='a' && c<'z'){
            c += 1;
            System.out.println(c);
        }
        else if(c==122) System.out.println('a');
        else if(c>='A' && c<'Z'){
            c += 33;
            System.out.println("c");
        }
        else if(c=='Z') System.out.println('a');
    }
}
