
package buoi15;

import java.util.*;

public class DemTuInHoa {
    public static boolean check (String s){
        String t = s;
        s = s.toUpperCase();
        return s.equals(t);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        String[] a = s.split("\\s+");
        int dem=0;
        for(String x : a){
            if(check(x)) dem++;
        }
        System.out.println(dem);
    }
}
