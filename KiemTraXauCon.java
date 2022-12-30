
package buoi15;

import java.util.*;

public class KiemTraXauCon {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        if(s.contains(t)){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
