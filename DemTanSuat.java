/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaSql12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Tuấn
 */

public class DemTanSuat {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            if(map.containsKey(x)){
                int tanSuat = map.get(x);
                ++tanSuat;
                map.put(x, tanSuat);
            }
            else {
                map.put(x,1);
            }
        }
        System.out.println(map.size());
        //B1: lay ra entrySet
        Set<Map.Entry<Integer,Integer>> entrySet = map.entrySet();
        //B2: Duyet tung entry trong entrySet
        for(Map.Entry<Integer,Integer> entry : entrySet) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }   
}
