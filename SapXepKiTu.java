
package buoi15;

import java.util.*;

public class SapXepKiTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] a = s.toCharArray();
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        System.out.println();
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]);
        }
    }
}
