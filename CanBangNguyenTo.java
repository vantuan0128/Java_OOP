
package buoi7;
import java.util.*;
public class CanBangNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        process(a,n);
        sc.close();
    }
    public static void process(int a[] ,int n){
        long left_sum = 0;
        long total_sum = 0;
        for(int i=0;i<n;i++) total_sum += a[i]; //Tong tat ca
        for(int i=0;i<n;i++){
            total_sum -= a[i]; //Tong phai
            if(SNT(left_sum) && SNT(total_sum)) System.out.print(i+" ");
               left_sum += a[i]; //Tong trai
        }
    }
    public static boolean SNT(long n){
        if(n < 2) return false;
        if(n == 2) return true;
        if(n % 2 == 0 && n != 2) return false;
        for(int i=3;i<=Math.sqrt(n);i += 2){
            if(n%i==0) return false;
        }
        return true;
    }
}
