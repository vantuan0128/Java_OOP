
package CodePTIT;

import java.util.*;

public class ChuanHoaHoTen2 {
    public static String vietHoa(String s){
        String t = "";
        char[] a = s.toCharArray();
        for(int i=0;i<a.length;i++){
            if(i==0) t += Character.toUpperCase(a[i]);
            else t += Character.toLowerCase(a[i]);
        }
        return t;
    }
    public static void chuanHoa(String s){
        String[]a = s.split("\\s+");
        String b = "";
        for(int i=1;i<a.length;i++){
            if(i < a.length-1){
                b += vietHoa(a[i]) + " ";
            }
            else if(i == a.length-1){
                b += vietHoa(a[a.length-1]) +", " + a[0].toUpperCase();
            }
        }
        System.out.println(b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            chuanHoa(s);
        }
    }   
}
