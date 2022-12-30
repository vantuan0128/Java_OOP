
package buoi15;

import java.util.*;

public class SapXepChuSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] a = s.toCharArray();
        Arrays.sort(a);
        for(int i = 0; i < a.length; i++){
            if(a[i] != '0' || i == a.length-1) System.out.print(a[i]);
        }
    }
}
