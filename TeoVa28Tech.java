
package buoi15;

import java.util.*;

public class TeoVa28Tech {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        int dem=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='2'&&s.charAt(i)!='8'&&
                    s.charAt(i)!='t'&&s.charAt(i)!='e'&&
                        s.charAt(i)!='c'&&s.charAt(i)!='h'){
                dem++;
                System.out.print(s.charAt(i));
            }
        }
        if(dem==0) System.out.println("EMPTY");
    }
}
