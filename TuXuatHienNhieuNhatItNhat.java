
package buoi15;

import java.util.*;

public class TuXuatHienNhieuNhatItNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        String []arr = s.split("\\s+");
        TreeMap<String,Integer> map1 = new TreeMap<>();
        for(String x : arr){
            if(map1.containsKey(x)){
                map1.put(x,1+map1.get(x));
            }
            else map1.put(x,1);
        }
        String max="",min="";
        int fre1=-10000000,fre2=10000000;
        Set<Map.Entry<String,Integer>> entry1 = map1.entrySet();
        for(Map.Entry<String,Integer> entry : entry1){
            if(entry.getValue() >= fre1){
                max = entry.getKey();
                fre1 = entry.getValue();
            }
            if(entry.getValue() <= fre2){
                min = entry.getKey();
                fre2 = entry.getValue();
            }
        }
        System.out.println(max+" "+fre1);
        System.out.println(min+" " +fre2);
    }
}
