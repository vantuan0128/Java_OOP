
package buoi15;

import java.util.*;

public class LietKeTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        String t = "";
        for(char x : s.toCharArray()){
            if(x=='.'||x==','||x=='!'||x=='?'){
                t += " ";
            }
            else t += x;
        }
        String[] arr = t.split("\\s+");
        for(String x : arr){
            System.out.print(x+" ");
        }
    }
}
