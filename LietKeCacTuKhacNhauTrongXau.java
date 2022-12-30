
package buoi15;

import java.util.*;

public class LietKeCacTuKhacNhauTrongXau {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        TreeSet<String> se1 = new TreeSet<>();
        LinkedHashSet<String> se2 = new LinkedHashSet<>();
        String s = sc.nextLine();
        String[] a =s.split("\\s+");
        for(String x : a){
            se1.add(x); se2.add(x);
        }
        for(String x : se1){
            System.out.print(x+" ");
        }
        System.out.println("");
        for(String x : se2){
            System.out.print(x+" ");
        }
    }
}
