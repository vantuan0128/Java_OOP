
package SVMC;

import java.util.*;
public class S122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        s = s.toLowerCase();
        t = t.toLowerCase();
        String []a = s.split("\\s+");
        String []b = t.split("\\s+");
        TreeSet<String> hop = new TreeSet<>();
        TreeSet<String> s1 = new TreeSet<>();
        TreeSet<String> s2 = new TreeSet<>();
        for(String x : a){
            hop.add(x);
            s1.add(x);
        }
        for(String x : b){
            hop.add(x);
            s2.add(x);
        }
        TreeSet<String> giao = new TreeSet<>();
        for(String x : hop){
            if(s1.contains(x) && s2.contains(x)){
                giao.add(x);
            }
        }
        for(String x : hop) System.out.print(x+" ");
        System.out.println();
        for(String x : giao) System.out.print(x+" ");
        System.out.println();
    }
}
