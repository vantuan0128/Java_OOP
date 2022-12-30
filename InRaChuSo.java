
package buoi15;

import java.util.*;

public class InRaChuSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        String so = "";
        String chu = "";
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                so += s.charAt(i);
            }
            else chu += s.charAt(i);
        }
        System.out.println(so);
        System.out.println(chu);
    }
}
