
package buoi15;

import java.util.*;

public class DemSoLuongTuKhacNhauTrongXau {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        HashSet<String> hs = new HashSet<>();
        String[] a = s.split("\\s+");
        for(String x : a){
            hs.add(x);
        }
        System.out.println(hs.size());
    }
}
