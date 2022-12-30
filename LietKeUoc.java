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
public class LietKeUoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList <Integer> List = new ArrayList<Integer>();
        int n = sc.nextInt();
        int dem=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                List.add(i);
                dem++;
            }
        }
        System.out.println(List.size());
        for(Integer x : List){
            System.out.print(x+" ");
        }
    }
}
