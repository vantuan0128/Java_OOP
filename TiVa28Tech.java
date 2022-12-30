
package buoi15;

import java.util.*;

public class TiVa28Tech {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        String[] a = s.split("\\s+");
        int dem=0;
        for(String x : a){
            if(x.equals("28tech")) dem++;
        }
        System.out.println(dem);
    }
}
