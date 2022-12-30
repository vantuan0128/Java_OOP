
package buoi15;

import java.util.*;

public class TuChanLe {
    public static String process(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        String [] a = s.split("\\s+");
        int dem=0;
        for(String x : a){
            dem++;
            if(dem%2==1) System.out.print(x+" ");
            else System.out.print(process(x)+" ");
        }
    }
}
