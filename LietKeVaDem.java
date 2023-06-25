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

public class LietKeVaDem {
    static final int MOD = (int) (1e9+7);
    
    public static boolean check(int n){
        int x = n % 10;
        n /= 10;
        while (n>0){
            int y = n % 10;
            if (y > x) return false;
            x = y;
            n /= 10;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        while(sc.hasNext()){
            Integer x = sc.nextInt();
            if(check(x)) {
                list.add(x);
                if(map.containsKey(x)){
                    int fre = map.get(x);
                    fre++;
                    map.put(x,fre);
                }
                else map.put(x,1);
            }
        }
        Collections.sort(list,new Comparator <Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                if(map.get(o1) == map.get(o2)) return o1 - o2;
                return map.get(o2) - map.get(o1);
            }
        });
        //Loai bo trung, giu duoc thu tu trong list
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int x : list) set.add(x);
        for(int x : set) {
            System.out.println(x+" "+map.get(x));
        }
    }
}
