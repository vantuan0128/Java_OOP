
package buoi15;

import java.util.*;

public class KiTuTrongDoan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for(char x : s.toCharArray()){
            if(Character.isDigit(x)){
                sum += x - '0' ;
            }
        }
        System.out.println(sum);
    }
}
