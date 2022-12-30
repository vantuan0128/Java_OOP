package buoi1;

/**
 *
 * @author Tuấn
 */
import java.util.*;
public class LuyenTapVietCauDieuKien {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        if(n%2==0) System.out.println("YES");
            else System.out.println("NO");
        if(n%3==0 && n%5==0) System.out.println("YES");
            else System.out.println("NO");
        if(n%3==0 && n%7!=0) System.out.println("YES");
            else System.out.println("NO");
        if(n%3==0 || n%7==0) System.out.println("YES");
            else System.out.println("NO");
        if(n>30 && n<50)   System.out.println("YES");
            else System.out.println("NO");
        if(n>=30 && (n%2==0||n%3==0||n%5==0)) System.out.println("YES");
            else System.out.println("NO");
        if(dem(n) && check(n%10)) System.out.println("YES");
            else System.out.println("NO");
        if(n<=100 && n%23==0) System.out.println("YES");
            else System.out.println("NO");
        if(n<10 || n>20) System.out.println("YES");
            else System.out.println("NO");
        if((n%10)%3==0) System.out.println("YES");
            else System.out.println("NO");
    }
    public static boolean check(int n){
        if(n<2) return false;
        if(n==2) return true;
        for(int i = 2; i<= (int) Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static boolean dem(int n){
        int dem = 0;
        if(n < 10) return false;
        while(n > 0){
            int m = n % 10;
            if(m >= 0 && m <= 9) dem++;
            n /= 10;
            if(dem > 2) return false;
        }
        if(dem==2) return true;
        else return false;
    }
}
