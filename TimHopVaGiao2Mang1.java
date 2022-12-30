
package buoi12;

import java.util.*;
public class TimHopVaGiao2Mang1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        TreeSet<Integer> giao = new TreeSet<>();
        TreeSet<Integer> hop = new TreeSet<>();
        TreeSet<Integer> set1 = new TreeSet<>();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            hop.add(x);
            set1.add(x);
        }
        for(int i=0;i<m;i++){
            int x = sc.nextInt();
            hop.add(x);
            if(set1.contains(x)){
                giao.add(x);
            }
        }
        for(int x : giao){
                System.out.print(x+" ");
        }
        System.out.println();
        for(int x : hop){
                System.out.print(x+" ");
        }
    }
}
