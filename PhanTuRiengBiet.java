
package buoi12;

import java.util.*;

public class PhanTuRiengBiet {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        LinkedHashSet<Long> m = new LinkedHashSet<>();
        for(int i=0; i<n; i++){
            Long x = sc.nextLong();
            m.add(x);
        }
        for(Long x : m){
            System.out.print(x+" ");
        }
    }
}
