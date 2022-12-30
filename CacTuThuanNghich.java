
package buoi15;

import java.util.*;

public class CacTuThuanNghich {
    public static boolean check(String s){
        StringBuilder t = new StringBuilder(s);
        if(t.reverse().toString().equals(s)) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        String [] a = s.split("\\s+");
        Arrays.sort(a,new Comparator<String>() {
            @Override
            public int compare(String t, String t1) {
                return t.compareTo(t1);
            }
        });
        for(String x : a){
            if(check(x)) System.out.print(x+" ");
        }
    }
}
