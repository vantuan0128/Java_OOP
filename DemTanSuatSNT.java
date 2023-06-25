/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaSql13;

/**
 *
 * @author Tuấn
 */
import java.util.*;

public class DemTanSuatSNT {
    public static boolean nguyenTo(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return n>1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        while(sc.hasNext()){
            int temp = sc.nextInt();
            if(nguyenTo(temp)){
                if(map.containsKey(temp)){
                    int tanSuat = map.get(temp);
                    ++tanSuat;
                    map.put(temp,tanSuat);
                }
                else map.put(temp,1);
            }
        }
        Set<Map.Entry<Integer,Integer>> entrySet = map.entrySet();
        for(Map.Entry<Integer,Integer> entry : entrySet){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
