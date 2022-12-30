
package buoi15;

import java.util.*;

public class InLatNguocInHoaInThuong {
    public static String process(String s){
        StringBuilder t = new StringBuilder(s);
        s = t.reverse().toString();
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        System.out.println(process(s));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
    }
}
