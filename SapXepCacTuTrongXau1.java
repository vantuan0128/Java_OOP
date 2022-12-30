
package buoi15;

import java.util.*;

public class SapXepCacTuTrongXau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        String[]a = s.split("\\s+");
        Arrays.sort(a);
        for(String x : a){
            System.out.print(x+" ");
        }
        System.out.println("");
        Arrays.sort(a,new Comparator<String>() {
            @Override
            public int compare(String t, String t1) {
                if(t.length()!=t1.length()) return t.length()-t1.length();
                else return t.compareTo(t1);
            }
        });
        for(String x : a){
            System.out.print(x+" ");
        }
    }
}
