
package buoi15;

import java.util.*;

public class KiTuLapLaiDauTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        char[] cnt = new char[256];
        String s = sc.nextLine();
        for(char x : s.toCharArray()){
            if(cnt[x]==1){
                System.out.println(x);
                return;
            }
            else cnt[x] = 1;
        }
        System.out.println("NONE");
    }
}
