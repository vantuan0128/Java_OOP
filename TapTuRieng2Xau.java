
package CodePTIT;

import java.util.*;

public class TapTuRieng2Xau {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int m = sc.nextInt();
        sc.nextLine();
        TreeSet<String> se1 = new TreeSet<>();
        TreeSet<String> se2 = new TreeSet<>();
        while(m-->0){
            String s = sc.nextLine();
            String[] a = s.split("\\s+");
            for(String x : a){
                se1.add(x);
            }
            String t = sc.nextLine();
            String[] b = t.split("\\s+");
            for(String x : b){
                se2.add(x);
            }
            for(String x : se1){
                if(!se2.contains(x)){
                    System.out.print(x+" ");
                }
            }
            System.out.println();
            se1.clear();
            se2.clear();
        }
    }
    
}
