/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi5;

/**
 *
 * @author Tuấn
 */
import java.util.*;
public class Main {
    public static boolean nguyenTo(int n){
        for(int i=2;i<=n-1;i++){
            if(n%i==0) return false;
        }
        if(n>1) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
    }
}
