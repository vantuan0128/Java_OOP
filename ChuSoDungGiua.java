
package buoi15;

import java.util.*;

public class ChuSoDungGiua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.length() % 2 == 0){
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println(s.charAt(s.length()/2));
        }
    }
}
