
package buoi15;

import java.util.*;

public class ChenDauPhay {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        String ans = "";
        int dem = 0;
        for(int i = s.length()-1 ; i >= 0; i--){
            dem++;
            ans += s.charAt(i);
            if(dem % 3 == 0 && i != 0)  ans += ","; 
         }
        for(int i = ans.length()-1; i >=0; i--){
            System.out.print(ans.charAt(i));
        }
    }
}
