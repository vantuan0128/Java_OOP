
package buoi12;

import java.util.HashSet;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        HashSet<Integer> set = new HashSet<>();
        int []a = {1,2,3,1,1,2,3,5};
        for(int x : a){
            set.add(x);
        }
        for(int x : set){
            System.out.println(x+" ");
        }
    }
}
